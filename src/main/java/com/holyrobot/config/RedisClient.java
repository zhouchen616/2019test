package com.holyrobot.config;

import com.alibaba.fastjson.JSON;
import com.holyrobot.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * RedisUtill
 *
 * @author bigsea
 */
@Component
@Slf4j
public class RedisClient {

    Logger logger = LoggerFactory.getLogger(RedisClient.class);
    @Autowired
    private JedisPool jedisPool;


    /**
     * 为了和.NET 存入的格式一致，通过反射去掉UUID中的“-”,并且大写转小写
     * 存入redis之前先处理UUID格式
     * @param key
     * @return
     */
    public String setIncludeUUID(String key, List list1) {
        List list = new ArrayList(list1);
        log.info("list==list1?{}",list==list1);
        Jedis jedis = null;
        try {
            for(Object o:list){
                Class<?> oClass = o.getClass();
                Field[] declaredFields = oClass.getDeclaredFields();
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    String name = field.getName();
                    if (name.endsWith("id") && field.getAnnotatedType().getType().toString().contains("String")) {
                        //构造get方法
                        name = name.substring(0, 1).toUpperCase() + name.substring(1);
//                        log.debug("get方法：{}", name);
                        Method method = oClass.getMethod("get" + name);
                        String value = (String) method.invoke(o);
//                        log.debug("value:{}", value);
                        if (StringUtil.isUUID(value)) {
                            field.set(o, StringUtil.uuidToStr(value));
                        }
                    }
                }
            }
            jedis = jedisPool.getResource();
            jedis.set(key, JSON.toJSONString(list));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return JSON.toJSONString(list);
    }


    /**
     * .NET存入redis中的UUID不含“-”,并且全为小写
     *  从redis中取出数据，处理uuid
     * @param key
     * @param c
     * @return
     */
    public List getNotUUID(String key, Class c) {
        log.info("****redis****key={}",key);
        Jedis jedis = null;
        String string = null;
        List list = new ArrayList();
        try {
            jedis = jedisPool.getResource();
            string = jedis.get(key);
            if(string!=null&&string.length()>0){
                list = JSON.parseArray(string, c);
                for (Object o : list) {
                    Class<?> oClass = o.getClass();
                    Field[] declaredFields = oClass.getDeclaredFields();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        String name = field.getName();
                        if (name.endsWith("id") && field.getAnnotatedType().getType().toString().contains("String")) {
                            //构造get方法
                            name = name.substring(0, 1).toUpperCase() + name.substring(1);
//                            log.debug("get方法：{}", name);
                            Method method = oClass.getMethod("get" + name);
                            String value = (String) method.invoke(o);
//                            log.debug("value:{}", value);
                            if (StringUtil.isNotUUID(value)) {
                                field.set(o, StringUtil.strToUUID(value));
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        return list;
    }

   /* public void set(String key, String value) throws Exception {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }*/

    /*public String get(String key) throws Exception {

        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } finally {
            //返还到连接池
            jedis.close();
        }
    }*/


    /**
     * @Author: 周陈
     * @Description: list中整个列表值
     */
    public List<byte[]> polls(String key) throws Exception {
        Jedis jedis = null;
        List<byte[]> rpops;
        try {
            jedis = jedisPool.getResource();
            rpops = jedis.lrange(key.getBytes(), 0, -1);
        } finally {
            //返还到连接池
            jedis.close();
        }
        return rpops;
    }

    public String get(String key) {
        Jedis jedis = null;
        String string = null;
        try {
            jedis = jedisPool.getResource();
            string = jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return string;
    }

    public String set(String key, String value) {
        Jedis jedis = null;
        String string = null;
        try {
            jedis = jedisPool.getResource();
            string = jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return string;
    }

    public String set(String key, String value, long time) {
        Jedis jedis = null;
        String string = null;
        try {
            jedis = jedisPool.getResource();
            //NX|XX, NX -- Only set the key if it does not already exist. XX -- Only set the key
            //   *          if it already exist.
            string = jedis.set(key, value, "NX", "EX"/*seconds*/, time);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return string;
    }

    public String hget(String hkey, String key) {
        Jedis jedis = null;
        String string = null;
        try {
            jedis = jedisPool.getResource();
            string = jedis.hget(hkey, key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return string;
    }

    public long hset(String hkey, String key, String value) {
        Jedis jedis = null;
        Long result = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.hset(hkey, key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return result;
    }

    public long incr(String key) {
        Jedis jedis = null;
        Long result = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.incr(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return result;
    }

    public long expire(String key, int second) {
        Jedis jedis = null;
        Long result = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.expire(key, second);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return result;
    }

    public long ttl(String key) {
        Jedis jedis = null;
        Long result = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.ttl(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return result;
    }

    public long del(String key) {
        Jedis jedis = null;
        Long result = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.del(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return result;
    }

    public long hdel(String hkey, String key) {
        Jedis jedis = null;
        Long result = null;
        try {
            jedis = jedisPool.getResource();
            result = jedis.hdel(hkey, key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return result;
    }


    public List<Object> lrange(String key, int start, int end) {
        Jedis jedis = null;
        List<Object> obj = new ArrayList<>();
        try {
            jedis = jedisPool.getResource();
            List<byte[]> list = jedis.lrange(key.getBytes(), start, end);
            for (int i = 0; i < list.size(); i++) {
                byte[] bs = list.get(i);
                Object unserizlize = this.unserizlize(bs);
                obj.add(unserizlize);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return obj;
    }

    public void addObjectToList(String Key, Object obj) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.lpush(Key.getBytes(), this.serialize(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    }

    public Object pollFromList(String key) {
        Jedis jedis = null;
        Object unserizlize = null;
        try {
            jedis = jedisPool.getResource();
            byte[] rpop = jedis.rpop(key.getBytes());
            if (Objects.nonNull(rpop)) {
                unserizlize = this.unserizlize(rpop);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return unserizlize;
    }

    public byte[] serialize(Object obj) {
        ObjectOutputStream obi = null;
        ByteArrayOutputStream bai = null;
        try {
            bai = new ByteArrayOutputStream();
            obi = new ObjectOutputStream(bai);
            obi.writeObject(obj);
            byte[] byt = bai.toByteArray();
            return byt;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object unserizlize(byte[] byt) {
        ObjectInputStream oii = null;
        ByteArrayInputStream bis = null;
        bis = new ByteArrayInputStream(byt);
        try {
            oii = new ObjectInputStream(bis);
            Object obj = oii.readObject();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Set<String> getKeys(String key) {
        Jedis jedis = null;
        Set<String> keys = null;
        try {
            jedis = jedisPool.getResource();
            keys = jedis.keys(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return keys;
    }

    public void flushDB() {
        // TODO Auto-generated method stub
        Jedis jedis = jedisPool.getResource();
        jedis.flushDB();
        jedis.close();
    }



    public String setex(String key, int expire, String value) {
        Jedis jedis = null;
        String string = null;
        try {
            jedis = jedisPool.getResource();
            string = jedis.setex(key, expire, value);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return string;
    }

    /**
     * @Author: 周陈
     * @Description: 添加序列化对象进入list
     */
    public void add(String key, byte[] value){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key.getBytes(), value);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //返还到连接池
            jedis.close();
        }
    }

    public byte[] getByte(String key){
        Jedis jedis = null;
        byte[] bytes = null;
        try {
            jedis = jedisPool.getResource();
            bytes = jedis.get(key.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return bytes;
    }
}
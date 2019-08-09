package com.holyrobot.util;


import java.util.Random;
import java.util.UUID;

/**
 * @author 汤玉林
 * @Description: 字符串工具类
 * @date 2018年3月22日 上午9:14:40
 */
public class StringUtil {
    private static String REG_UUID = "^([0-9a-z]|[0-9A-Z]){8}-([0-9a-z]|[0-9A-Z]){4}-([0-9a-z]|[0-9A-Z]){4}" +
            "-([0-9a-z]|[0-9A-Z]){4}-([0-9a-z]|[0-9A-Z]){12}$";
    private static String REG = "^([0-9a-z]|[0-9A-Z]){32}";
    private static String REG_INT="^[0-9]*";

    /**
     * 正则判断是否为UUID
     *
     * @param uuid
     * @return
     */
    public static boolean isUUID(String uuid) {
        if (uuid == null) {
            return false;
        }
        return uuid.matches(REG_UUID);
    }
    /**
     *  判断是否为数字
     * @param srt
     * @return
     */
    public static boolean isInt(String srt) {
        return srt.matches(REG_INT);
    }
    /**
     * 正则匹配
     *
     * @param uuid
     * @return
     */
    public static boolean isNotUUID(String uuid) {
        if (uuid == null) {
            return false;
        }
        return uuid.matches(REG);
    }

    /**
     * 字符串转uuid
     *
     * @param str
     * @return
     */
    public static String strToUUID(String str) {
        if (!str.matches(REG)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.insert(8, "-");
        stringBuffer.insert(13, "-");
        stringBuffer.insert(18, "-");
        stringBuffer.insert(23, "-");
        return stringBuffer.toString().toUpperCase();
    }

    /**
     * uuid转字符串
     *
     * @param str
     * @return
     */
    public static String uuidToStr(String str) {
        if (!str.matches(REG_UUID)) {
            return str;
        }
        return str.replace("-", "").toLowerCase();
    }

    /**
     * @param str
     * @return
     * @description 给定字符串是否为空或空串
     * @author rico
     * @created 2017年7月4日 下午5:15:46
     */
    public static boolean isNotEmpty(String str) {
        if (str != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    /**
     * @param str
     * @return
     * @description 给定字符串是否为空或空串
     * @author rico
     * @created 2017年7月4日 下午5:15:46
     */
    public static boolean isEmpty(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }
    /**
     * 生成随机字符串
     * @return
     */
    public static String getNonce() {
        char[] chars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890".toCharArray();
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            sb.append(chars[random.nextInt(chars.length)]);
        }
        return sb.toString();
    }

    public static String h5IndexRedisKey(String orgId, String siteId){
        return String.format("pc_index_%s_%s",orgId,siteId);
    }

    public static void main(String[] args) {
        String s = UUID.randomUUID().toString();
        //System.out.println(isUUID(s));
        //System.out.println(isNotUUID(s.replace("-","")));
        String replace = s.replace("-", "");
        System.out.println(replace);
        System.out.println(s);
        String s1 = strToUUID(replace);
        System.out.println(s1 + isUUID(s1));
        System.out.println(uuidToStr(s1));
    }

    /**
     *
     * @Description: 判断字符串是否为英语
     *
     * @auther: 史迪旻
     * @date: 11:13 2018-12-21
     * @param: [charaString]
     * @return: boolean
     *
     */
    public static boolean isEnglish(String charaString){

        return charaString.matches("^[a-zA-Z]*");

    }

    /**
     * @Description: 判断证件
     * @auther: 史迪旻
     * @date: 00:20 2018-12-28
     * @param: [str]
     * @return: boolean
     */
    public static boolean whatDocument(String document) {
        switch (document) {
            case "护照":
                return true;
            case "港澳通行证":
                return true;
            case "台胞证":
                return true;
            case "回乡证":
                return true;
        }

        return false;
    }


}

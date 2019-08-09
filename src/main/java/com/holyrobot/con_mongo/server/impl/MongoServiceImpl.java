package com.holyrobot.con_mongo.server.impl;

import com.holyrobot.con_mongo.server.MongoService;
import com.holyrobot.dto.mongo.H5ShopUserSkinCollection;
import com.holyrobot.dto.mongo.SearchCountCollection;
import com.holyrobot.dto.mongo.SearchHistoryCollection;
import com.holyrobot.dto.mongo.SearchSuppliersCollection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName： MongoServiceImpl
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-7-5 11:53
 * @Version: 1.0
 * @Modified By:
 */

@Service
@Slf4j
public class MongoServiceImpl implements MongoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * @Description: 添加数据
     * @auther: 史迪旻
     * @date: 14:53 2018-7-5
     * @param: [object]
     * @return: void
     */
    @Override
    public void add(Object object) {
        this.mongoTemplate.insert(object);
    }

    /**
     * @Description: SearchHistoryCollection 更新数据
     * @auther: 史迪旻
     * @date: 15:12 2018-7-5
     * @param: [object]
     * @return: void
     */
    @Override
    public void update(Object object) {
        this.mongoTemplate.save(object);
    }

    /**
     * @Description: 通过userId删除用户历史搜索记录
     * @auther: 史迪旻
     * @date: 19:44 2018-7-6
     * @param: [id]
     * @return: void
     */
    @Override
    public void deleteByUserId(String userId) {
        Query query = new Query();
        Criteria criteria = Criteria.where("userId").is(userId);
        query.addCriteria(criteria);
        mongoTemplate.remove(query, SearchHistoryCollection.class);
    }

    /**
     * @Description: 通过供应商名字和用户id删除信息
     * @auther: 史迪旻
     * @date: 14:42 2018-7-16
     * @param: []
     * @return: void
     */
    @Override
    public void deleteSupplierByUserIdAndKeyWords(String userId, String keyWords) {
        Query query = new Query();
        Criteria criteria = Criteria.where("userId").is(userId).and("keyWords").is(keyWords);
        query.addCriteria(criteria);
        mongoTemplate.remove(query, SearchSuppliersCollection.class);
    }

    /**
     * @Description: SearchHistoryCollection 按照用户信息和日期降序查询
     * @auther: 史迪旻
     * @date: 15:16 2018-7-5
     * @param: [userId, date]
     * @return: java.util.List<com.holyrobot.dto.mongo.SearchHistoryCollection>
     */
    @Override
    public List<SearchHistoryCollection> findByUserIdWithDate(String userId) {
        Query query = new Query();
        List<SearchHistoryCollection> searchHistoryCollections = null;
        try {
            Criteria criteria = Criteria.where("userId").is(userId);
            query.addCriteria(criteria);
            query.with(new Sort(Sort.Direction.DESC, "timestamp"));
            searchHistoryCollections = mongoTemplate.find(query, SearchHistoryCollection.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return searchHistoryCollections;
    }

    /**
     * @Description: SearchHistoryCollection 通过用户信息查询
     * @auther: 史迪旻
     * @date: 18:28 2018-7-5
     * @param: [entityClass, id]
     * @return: T
     */
    @Override
    public List<SearchHistoryCollection> findByUserId(String userId) {
        Query query = new Query();
        List<SearchHistoryCollection> searchHistoryCollections = null;
        try {
            Criteria criteria = Criteria.where("userId").is(userId);
            query.addCriteria(criteria);
            searchHistoryCollections = mongoTemplate.find(query, SearchHistoryCollection.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (searchHistoryCollections == null || searchHistoryCollections.size() == 0) {
            return null;
        } else {
            return searchHistoryCollections;
        }
//        return searchHistoryCollections;
    }

    /**
     * @Description: SearchHistoryCollection 通过用户信息和用户输入的内容进行查询
     * @auther: 史迪旻
     * @date: 19:17 2018-7-5
     * @param: [userId, keywords]
     * @return: java.util.List<com.holyrobot.dto.mongo.SearchHistoryCollection>
     */
    @Override
    public List<SearchHistoryCollection> findByUserIdAndKeywords(String userId, String keywords) {
        Query query = new Query();
        List<SearchHistoryCollection> searchHistoryCollections = null;
        try {
            Criteria criteria = Criteria.where("userId").is(userId).and("keywords").is(keywords);
            query.addCriteria(criteria);
            searchHistoryCollections = mongoTemplate.find(query, SearchHistoryCollection.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return searchHistoryCollections;
    }

    /**
     * @Description: 通过计数数值降序查询
     * @auther: 史迪旻
     * @date: 09:10 2018-7-11
     * @param: []
     * @return: java.util.List<com.holyrobot.dto.mongo.SearchCountCollection>
     */
    @Override
    public List<SearchCountCollection> findByCount() {
        Query query = new Query();
        List<SearchCountCollection> searchCountCollections = null;
        try {
            query.with(new Sort(Sort.Direction.DESC, "count"));
            searchCountCollections = mongoTemplate.find(query, SearchCountCollection.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (searchCountCollections == null || searchCountCollections.size() == 0) {
            return null;
        } else {
            return searchCountCollections;
        }

    }

    /**
     * @Description: 通过用户键入后选择的信息查询
     * @auther: 史迪旻
     * @date: 10:47 2018-7-16
     * @param: [keyWords]
     * @return: java.util.List<com.holyrobot.dto.mongo.SearchSuppliersCollection>
     */
    @Override
    public List<SearchSuppliersCollection> findByUserIdAndSuppliers(String keyWords, String userId) {
        Query query = new Query();
        List<SearchSuppliersCollection> searchSuppliersCollections = null;
        try {
            Criteria criteria = Criteria.where("keyWords").is(keyWords).and("userId").is(userId);
            query.addCriteria(criteria);
            searchSuppliersCollections = mongoTemplate.find(query, SearchSuppliersCollection.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return searchSuppliersCollections;

    }

    /**
     * @Description: 通过用户id去查供应商信息
     * @auther: 史迪旻
     * @date: 14:13 2018-7-16
     * @param: [userId]
     * @return: java.util.List<com.holyrobot.dto.mongo.SearchSuppliersCollection>
     */
    @Override
    public List<SearchSuppliersCollection> findSuppliersByUserIdWithDateForDesc(String userId) {
        Query query = new Query();
        List<SearchSuppliersCollection> searchSuppliersCollections = null;
        try {
            Criteria criteria = Criteria.where("userId").is(userId);
            query.addCriteria(criteria);
            query.with(new Sort(Sort.Direction.DESC, "timeStamp"));
            searchSuppliersCollections = mongoTemplate.find(query, SearchSuppliersCollection.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (searchSuppliersCollections != null) {
            return searchSuppliersCollections;
        } else {
            return null;
        }

    }

    /**
     * 　　* @Description: h5shop用户皮肤查询
     * 　　* @author 周陈
     * 　　* @date 2018/12/25 14:02
     *
     */
    @Override
    public H5ShopUserSkinCollection findH5ShopUserSkin(String userId) {
        Query query = new Query();
        Criteria criteria = Criteria.where("userId").is(userId);
        query.addCriteria(criteria);
        List<H5ShopUserSkinCollection> h5ShopUserSkinCollection = mongoTemplate.find(query, H5ShopUserSkinCollection.class);
        if (h5ShopUserSkinCollection != null && h5ShopUserSkinCollection.size() > 0) {
            return h5ShopUserSkinCollection.get(0);
        }
        return null;
    }

    /**
     * 　　* @Description: h5shop用户皮肤修改、保存
     * 　　* @author 周陈
     * 　　* @date 2018/12/25 14:02
     *
     */
    @Override
    public void updateH5ShopUserSkin(String userId, String openId, Integer skinType) {
        H5ShopUserSkinCollection h5ShopUserSkin = this.findH5ShopUserSkin(userId);
        if (h5ShopUserSkin == null) {
            //添加
            log.info("用户首次添加皮肤" );
            h5ShopUserSkin = new H5ShopUserSkinCollection();
            h5ShopUserSkin.setOpenId(openId);
            h5ShopUserSkin.setSkinType(skinType);
            h5ShopUserSkin.setUserId(userId);
            this.add(h5ShopUserSkin);
        }else {
            //修改
            log.info("用户修改皮肤" );
            this.update(h5ShopUserSkin);
        }


    }


    /**
     * @Description:
     * @auther: 史迪旻
     * @date: 20:00 2018-7-5
     * @param: [entityClass, id]
     * @return: java.lang.Object
     */
    @Override
    public Object findById(Class entityClass, String id) {
        Object mongoTemplateById = null;
        try {
            mongoTemplateById = mongoTemplate.findById(id, entityClass);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mongoTemplateById;
    }


}

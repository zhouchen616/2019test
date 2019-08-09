package com.holyrobot.con_mongo.server;

import com.holyrobot.dto.mongo.H5ShopUserSkinCollection;
import com.holyrobot.dto.mongo.SearchCountCollection;
import com.holyrobot.dto.mongo.SearchHistoryCollection;
import com.holyrobot.dto.mongo.SearchSuppliersCollection;

import java.util.List;

/**
 * @ClassName： MongoService
 * @Description:
 * @Author: 史迪旻
 * @Date: Created in 2018-7-5 11:53
 * @Version: 1.0
 * @Modified By:
 */
public interface MongoService {

    void add(Object object);

    void update(Object object);

    void deleteByUserId(String userId);

    void deleteSupplierByUserIdAndKeyWords(String userId, String keyWords);

    List<SearchHistoryCollection> findByUserIdWithDate(String userId);

    List<SearchHistoryCollection> findByUserId(String userId);

    List<SearchHistoryCollection> findByUserIdAndKeywords(String userId, String keywords);

    <T> T findById(Class<T> entityClass, String id);

    List<SearchCountCollection> findByCount();

    List<SearchSuppliersCollection> findByUserIdAndSuppliers(String keyWords, String userId);

    List<SearchSuppliersCollection> findSuppliersByUserIdWithDateForDesc(String userId);

    H5ShopUserSkinCollection findH5ShopUserSkin(String userId);

    void updateH5ShopUserSkin(String userId, String openId, Integer skinType);
}

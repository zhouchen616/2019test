package com.holyrobot.repository;


import com.holyrobot.repository.comment.EsProProduct;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 周陈
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/5/1410:33
 */
public interface EsProProductRepository extends ElasticsearchRepository<EsProProduct, String> {
}

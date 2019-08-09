package com.holyrobot.con_common.server.impl;

import com.holyrobot.con_common.server.EsResRegionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.holyrobot.repository.EsResRegionRepository;
//import org.elasticsearch.index.query.QueryBuilders;

/**
 * @author 周陈
 * @Title: Es行政区域Service
 * @date 2018/6/1 15:59
 */
@Slf4j
@Service
public class EsResRegionServiceImpl implements EsResRegionService {
//    @Autowired
//    private EsResRegionRepository resRegionRepository;
    @Autowired
    //private ResRegionMapper mapper;

    private static final Integer LEVEL_TYPE = 2;

    private static String STORT_NAME = "shortName";
    private static String PING_YIN = "pinYin";

    /**
     * 连接OMP数据库 查询行政区域数据
     *
     * @return
     */
//    @Override
//    public List<ResRegion> getResRegionByLevelType() {
//        ResRegionExample example = new ResRegionExample();
//        example.or().andLeveltypeEqualTo(this.LEVEL_TYPE);
//        return mapper.selectByExample(example);
//    }

    /**
     * 根据出发地名查询
     *
     * @param name
     * @return
     */
//    @Override
//    public List<EsResRegion> findEsResRegionByName(String name) {
//        if(StringUtils.isEmpty(name)){
//            return new ArrayList<>();
//        }
//        Iterable<EsResRegion> search = resRegionRepository.search(QueryBuilders.boolQuery().
//                should(QueryBuilders.matchQuery(STORT_NAME, name)).
//                should(QueryBuilders.prefixQuery(PING_YIN, name)));
////        List<EsResRegion> list = IteratorUtils.toList(search.iterator());
//        List<EsResRegion> list = IterableUtils.toList(search);
//        return list;
//    }

    /**
     * 将行政区域数据存入ES
     */
//    @Override
//    public void sevaEsResRegion() {
//        List<ResRegion> resRegionByLevelType = getResRegionByLevelType();
//        log.info(JSON.toJSONString(resRegionByLevelType));
//        resRegionByLevelType.forEach(resRegion -> {
//            //String id, String rid, String parentId, String shortName, Integer levelType, String pinYin
//            EsResRegion esResRegion = new EsResRegion(
//                    resRegion.getId(), resRegion.getRid(), resRegion.getParentid(),
//                    resRegion.getShortname(), resRegion.getLeveltype(), resRegion.getPinyin());
//            //此处添加到es   注释掉，需要的时候开启
//            //resRegionRepository.save(esResRegion);
//            log.info("" + esResRegion);
//        });
//    }


}

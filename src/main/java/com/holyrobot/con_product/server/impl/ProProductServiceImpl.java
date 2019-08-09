package com.holyrobot.con_product.server.impl;

import com.alibaba.fastjson.JSON;
import com.holyrobot.con_om.mapper.OmDestinationMapper;
import com.holyrobot.con_om.mapper.OmProducttypeMapper;
import com.holyrobot.con_om.mapper.OmRoutetypeMapper;
import com.holyrobot.con_om.pojo.OmDestination;
import com.holyrobot.con_om.pojo.OmProducttype;
import com.holyrobot.con_om.pojo.OmProducttypeExample;
import com.holyrobot.con_volunteer.mapper.VolunteerProductMapper;
import com.holyrobot.config.RedisClient;
import com.holyrobot.constant.Constants;
import com.holyrobot.dto.NewProductAndDestDto;
import com.holyrobot.dto.ProSearchCondition;
import com.holyrobot.dto.ProductListDto;
import com.holyrobot.con_product.mapper.*;
import com.holyrobot.response.Response;
import com.holyrobot.con_product.server.ProProductService;
import com.holyrobot.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

//import com.holyrobot.repository.EsProProductRepository;
//import com.holyrobot.repository.EsProProductTourRepository;
//import org.elasticsearch.index.query.BoolQueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.index.query.RangeQueryBuilder;

/**
 * @author 周陈
 * @Title: 商品service
 * @date 2018/5/8 14:01
 */
@Service
@Slf4j
public class ProProductServiceImpl implements ProProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProProductServiceImpl.class);
    final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd");
    final SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
    //    @Autowired
//    private EsProProductRepository esProProduct;
//    @Autowired
//    private EsProProductTourRepository esProProductTour;
    @Autowired
    private RedisClient redisClient;
    @Autowired
    private OmProducttypeMapper omProducttypeMapper;
    @Autowired
    private OmRoutetypeMapper omRoutetypeMapper;
    @Autowired
    private OmDestinationMapper omDestinationMapper;
    @Autowired
    private ProProductMapper proProductMapper;
    @Value("${siteid}")
    private String siteId;
    @Value("${devStatus}")
    private String devStatus;
    @Autowired
    private VolunteerProductMapper volunteerProductMapper;

//    public Iterable<EsProProductTour> findEsProTour(EsSearchCondition esSearch) {
//        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
//        // boolQuery.filter(QueryBuilders.termQuery(Constants.ES_TOUR_SITE_ID, esSearch.getSiteId()));
//        if (devStatus.equals("dev")) {
//            //dev
//            boolQuery.filter(QueryBuilders.matchQuery(Constants.ES_TOUR_SITE_ID, esSearch.getSiteId()));
//        } else {
//            //pro
//            boolQuery.filter(QueryBuilders.termQuery(Constants.ES_TOUR_SITE_ID, esSearch.getSiteId()));
//        }
//        // 价格校验
//        /*if (Objects.nonNull(esSearch.getHighPrice()) || Objects.nonNull(esSearch.getLowPrice())) {
//            String priceType=Constants.ES_TOUR_DIRECT_PRICE;
//            if (esSearch.getUserType()==1){
//                priceType=Constants.ES_TOUR_SALE_PRICE;
//            }
//
//            logger.debug("*****进入价格查询*****getHighPrice:{},getLowPrice:{}", esSearch.getHighPrice(),
//                    esSearch.getLowPrice());
//            RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery(priceType);
//            // 最高价
//            if (Objects.nonNull(esSearch.getHighPrice())) {
//                rangeQuery.lte(esSearch.getHighPrice());
//            }
//            // 最低价
//            if (Objects.nonNull(esSearch.getLowPrice())) {
//                rangeQuery.gte(esSearch.getLowPrice());
//            }
//            boolQuery.filter(rangeQuery);
//        }*/
//
//        //设置开始时间不能小于今天
//        if (Objects.nonNull(esSearch.getBeginDate())) {
//            try {
//                Date parse = format1.parse(esSearch.getBeginDate());
//                //判断开始时间是否小于当前时间，如果小于，则将开始时间设置为当前时间
//                if (parse.before(new Date())) {
//                    esSearch.setBeginDate(format1.format(new Date()));
//                }
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//        } else {
//            esSearch.setBeginDate(format1.format(new Date()));
//        }
//
//        //限制出团日期大于当天
//        boolQuery.filter(QueryBuilders.rangeQuery(Constants.ES_TOUR_DATE).format("yyyy/MM/dd")
//                .gte(esSearch.getBeginDate()));
//
//        // 价格校验
//        if (Objects.nonNull(esSearch.getHighPrice()) || Objects.nonNull(esSearch.getLowPrice())) {
//            log.info("*****进入价格查询*****getHighPrice:{},getLowPrice:{}", esSearch.getHighPrice(),
//                    esSearch.getLowPrice());
//            RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery(
//                    // 通过用户类型 来筛选价格  1、分销价  2、直客价
//                    esSearch.getUserType() == 2 ? Constants.ES_TOUR_DIRECT_PRICE : Constants.ES_TOUR_SALE_PRICE
//            );
//            // 最高价
//            if (Objects.nonNull(esSearch.getHighPrice())) {
//                rangeQuery.lte(esSearch.getHighPrice());
//            }
//            // 最低价
//            if (Objects.nonNull(esSearch.getLowPrice())) {
//                rangeQuery.gte(esSearch.getLowPrice());
//            }
//            boolQuery.filter(rangeQuery);
//        }
//
//        Iterable<EsProProductTour> iterable = esProProductTour.search(boolQuery);
//        return iterable;
//    }
//
//    /**
//     * 分页查询Es数据
//     *
//     * @return
//     */
//    @Override
//    public EsProProductAndTotal findEsProProductPage(EsSearchCondition esSearch) {
//
//        //*********构建查询条件*********
//        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
//
//
//        //从tour中取出有团期的产品ID
//        Iterable<EsProProductTour> iterable = findEsProTour(esSearch);
//        Set<String> proIds = new HashSet<>();
//        iterable.forEach(esProProductTour -> {
//            proIds.add(esProProductTour.getProid());
//        });
//        logger.debug("*********proIds={}", proIds);
//        //*********封装条件*********
//
//        //1.从tour中取出的Set<id>查询 (暂时没数据,直接通过product筛选站点，后期去掉)
//        if (proIds.size() == 0) {
//            //如果proId==0 ，通过以下限制条件 search null
//            boolQuery.filter(QueryBuilders.termQuery(Constants.ES_PRODUCT_PRO_NO,
//                    Constants.ES_PRODUCT_RETURN_NULL));
//        } else {
//            List<String> list = new ArrayList<>(proIds);
//            // 注：测试环境 和 正式环境 ES 结构不一样
//            if (devStatus.equals("dev")) {
//                //dev
//                boolQuery.filter(QueryBuilders.matchQuery(Constants.ES_PRODUCT_ID, list));
//            } else {
//                //pro
//                boolQuery.filter(QueryBuilders.termsQuery(Constants.ES_PRODUCT_ID, list));
//            }
//        }
//        //2.发布平台
//        boolQuery.filter(QueryBuilders.termsQuery(Constants.ES_PRODUCT_PRO_SCOPE, Constants.ES_SCOPE_H5));
//
//        //isPublic
//        boolQuery.filter(QueryBuilders.termsQuery(Constants.ES_PRODUCT_IS_PUBLIC, Constants.ES_IS_PUBLIC_TRUE));
//        //4.供应商
//        if (Objects.nonNull(esSearch.getOrgId()) && esSearch.getOrgId().size() > 0) {
//            logger.debug("*****orgId类型查询*****getOrgId:{}", esSearch.getOrgId());
//            // 注：测试环境 和 正式环境 ES 结构不一样
//            if (devStatus.equals("dev")) {
//                //dev
//                boolQuery.
//                        filter(QueryBuilders.matchQuery(Constants.ES_PRODUCT_ORG_ID, esSearch.getOrgId()));
//            } else {
//                //pro
//                boolQuery.filter(QueryBuilders.termsQuery(Constants.ES_PRODUCT_ORG_ID, esSearch.getOrgId()));
//            }
//        }
//
//        //5.keyword
//        if (StringUtils.isNoneEmpty(esSearch.getKeywords())) {
//            logger.debug("*****进入目的地查询*****getKeywords:{}", esSearch.getKeywords());
//            //分词查询
//            if (StringUtil.isInt(esSearch.getKeywords())) {
//                //如果keyword为数字，则用通配符查询
//                boolQuery.filter(QueryBuilders.wildcardQuery(Constants.ES_PRODUCT_ALIASE_NAME, "*" + esSearch.getKeywords() + "*"));
//            } else {
//                boolQuery.filter(QueryBuilders.matchPhrasePrefixQuery(Constants.ES_PRODUCT_ALIASE_NAME, esSearch.getKeywords()));
//            }
//            //模糊查询
////           boolQuery.must(QueryBuilders.boolQuery()
////                   .should(QueryBuilders.matchPhraseQuery(Constants.ES_PRODUCT_PRO_TYPE_ID, esSearch.getKeywords()))
////                  .should(QueryBuilders.matchPhraseQuery(Constants.ES_PRODUCT_ALIASE_NAME, esSearch.getKeywords()))
////                   .should(QueryBuilders.matchPhraseQuery(Constants.ES_PRODUCT_DESTINATION, esSearch.getKeywords())));
//        }
//
//        //6.目的地
//        if (StringUtils.isNoneEmpty(esSearch.getDestination())) {
//            logger.debug("*****进入目的地查询*****getDestination:{}", esSearch.getDestination());
//            boolQuery.filter(
//                    QueryBuilders.matchPhraseQuery(Constants.ES_PRODUCT_DESTINATION, esSearch.getDestination()));
//        }
//        //7.产品类型
//        if (StringUtils.isNoneEmpty(esSearch.getProType())) {
//            logger.debug("*****进入产品类型查询*****getProType:{}", esSearch.getProType());
//            boolQuery.filter(QueryBuilders.termsQuery(Constants.ES_PRODUCT_PRO_TYPE_ID, esSearch.getProType()));
//        }
//
//        // 线路类型
//        if (StringUtils.isNoneEmpty(esSearch.getRouteTypeId())) {
//            logger.debug("*****进入线路类型查询*****getProCategoryID:{}", esSearch.getRouteTypeId());
//            // 注：测试环境 和 正式环境 ES 结构不一样
//            if (devStatus.equals("dev")) {
//                //dev
//                boolQuery.
//                        filter(QueryBuilders.matchQuery(Constants.ES_PRODUCT_PRO_CATEGORY_ID, esSearch.getRouteTypeId()));
//            } else {
//                //pro
//                boolQuery.
//                        filter(QueryBuilders.termQuery(Constants.ES_PRODUCT_PRO_CATEGORY_ID, esSearch.getRouteTypeId()));
//            }
//        }
//
//        //是否确认
//        if (Objects.nonNull(esSearch.getIsAck())) {
//            logger.debug("*****进入是否确认查询*****getIsAck:{}", esSearch.getIsAck());
//            boolQuery.filter(QueryBuilders.termQuery(Constants.ES_PRODUCT_IS_ACK, esSearch.getIsAck()));
//        }
//        //尾单查询
//        if (Objects.nonNull(esSearch.getIsTail())) {
//            logger.debug("*****进入尾单查询查询*****getIsTail:{}", esSearch.getIsTail());
//            boolQuery.filter(QueryBuilders.termQuery(Constants.ES_PRODUCT_IS_TAIL, esSearch.getIsTail()));
//        }
//
//        //******** 分页查询数据 *********
//        Page<EsProProduct> search = esProProduct.search(boolQuery,
//                PageRequest.of(esSearch.getStart(), esSearch.getSize(), Sort.by(esSearch.getOrderBy())));
//        //获取团期
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
//        search.forEach(esProProduct1 -> {
//            Set<String> set = new TreeSet<>();
//            BoolQueryBuilder boolQuery1 = QueryBuilders.boolQuery();
//
//            if (devStatus.equals("dev")) {
//                boolQuery1.filter(QueryBuilders.matchQuery(Constants.ES_TOUR_PRO_ID, esProProduct1.getiD().toLowerCase()));
//            } else {
//                boolQuery1.filter(QueryBuilders.termQuery(Constants.ES_TOUR_PRO_ID, esProProduct1.getiD().toLowerCase()));
//            }
//            //最后截止日期大于今天
//            boolQuery1.filter(QueryBuilders.rangeQuery(Constants.ES_TOUR_DUE_DATE).format("yyyy/MM/dd")
//                    .gte(simpleDateFormat1.format(new Date())));
//            //根据proId查询团期，排序根据出团日期
//            Iterable<EsProProductTour> search1 = esProProductTour.search(boolQuery1,
//                    //原本 PageRequest.of(0, 3, 但是存在 一天开多个班，所以会导致，返回的3个团期都是一样的值
//                    PageRequest.of(0, 9,
//                            Sort.by(Sort.Direction.ASC, Constants.ES_TOUR_DATE)));
//            log.debug("根据proId查询团期结果：{}", JSON.toJSONString(search1));
//            Iterator<EsProProductTour> iterator = search1.iterator();
//            //取出出团日期
//            while (iterator.hasNext() && set.size() < 3) {
//                set.add(simpleDateFormat.format(iterator.next().getTourDate()));
//            }
//            esProProduct1.setTours(new ArrayList<>(set));
//        });
//        //e. 封装返回
//        //TODO 用户类型需要改
//        return new EsProProductAndTotal(null, search, esSearch.getSite());
//    }

    /**
     * 查询产品类型
     *
     * @return
     */
    @Override
    public List<OmProducttype> getProType() {
        //从redis中取产品类型
        List<OmProducttype> productTypes;
        productTypes = redisClient.getNotUUID(Constants.REDIS_PRODUCT_TYPE, OmProducttype.class);
        //若redis中没有 则从数据库里查询，然后放到redis中
        if (productTypes == null || productTypes.size() == 0) {
            OmProducttypeExample example = new OmProducttypeExample();
            example.or().andDatastatusEqualTo(1);
            example.setOrderByClause("AliasID asc");
            productTypes = omProducttypeMapper.selectByExample(example);
            if (productTypes.size() > 0) {
                redisClient.setIncludeUUID(Constants.REDIS_PRODUCT_TYPE, productTypes);
            }
        }
        return productTypes;
    }

    /**
     * 根据线路别名Id查询目的地
     *
     * @param aliasId     线路类型的别名ID
     * @param routeTypeId 线路类型ID
     * @return
     */
    @Override
    public List<OmDestination> getDestinationByAliasId(Integer aliasId, String routeTypeId) {
        List<OmDestination> destinations = new ArrayList<>();
        destinations = redisClient.getNotUUID(Constants.getRedisDestination(siteId, aliasId), OmDestination.class);
        if (destinations == null || destinations.size() == 0) {
            destinations = omDestinationMapper.selectBySiteIdAndRouteTypeId(siteId, routeTypeId);
            if (destinations.size() > 0) {
                redisClient.setIncludeUUID(Constants.getRedisDestination(siteId, aliasId), destinations);
            }
        }
        return destinations;
    }

    /**
     * 　　* @Description:  根据目的地查询产品
     * 　　* @author 周陈
     * 　　* @date 2018/6/26 16:14
     */
//    @Override
//    public List<DestinationProductDto> getProductByDest(String siteId, String orgId) {
//        List<DestinationProductDto> list = new ArrayList<>();
//        List<OrgDestinationDto> orgDestinationDtos = proProductMapper.selectOrgDestination(orgId);
//        orgDestinationDtos.forEach(orgDestinationDto -> {
//            DestinationProductDto destinationProductDto = new DestinationProductDto();
//            destinationProductDto.setDestination(orgDestinationDto.getDestination());
//            //封装查询条件
//            EsSearchCondition esSearchCondition = new EsSearchCondition();
//            //站点id
//            esSearchCondition.setSiteId(siteId);
//            //orgId
//            esSearchCondition.setOrgId(Arrays.asList(orgId));
//            //目的地
//            esSearchCondition.setDestination(orgDestinationDto.getDestination());
//            EsProProductAndTotal esProProductPage = findEsProProductPage(esSearchCondition);
//            destinationProductDto.setEsProProductAndTotal(esProProductPage);
//            if (esProProductPage.getPage().getContent() != null && esProProductPage.getPage().getContent().size() > 0) {
//                list.add(destinationProductDto);
//            }
//        });
//        return list;
//    }

    /**
     * 　　* @Description:
     * 　　* @author 周陈
     * 　　* @date 2018/11/29 18:45
     */
    @Override
    public List<Map> getDestinationByTourDays(String orgId, String userId, Integer shopType) {
        List<Map> list = new ArrayList<>();
        for (String days : Constants.TOUR_DAYS) {
            List<String> destList = null;
            Map<String, Object> map = new HashMap<>();
            switch (days) {
                case "2~3天":
                    destList = proProductMapper.getDestinationByTourDays(orgId, 2, 3);
                    if (shopType != null && shopType == 1) {
                        destList = volunteerProductMapper.getDestinationByTourDays(userId, 2, 3);
                    }
                    if (destList != null && destList.size() > 0) {
                        map.put("isShown", 1);
                    } else {
                        map.put("isShown", 0);
                    }
                    map.put("days", days);
                    map.put("destList", destList);
                    list.add(map);
                    break;
                case "4~6天":
                    if (shopType != null && shopType == 1) {
                        destList = volunteerProductMapper.getDestinationByTourDays(userId, 4, 6);
                    } else {
                        destList = proProductMapper.getDestinationByTourDays(orgId, 4, 6);
                    }

                    if (destList != null && destList.size() > 0) {
                        map.put("isShown", 1);
                    } else {
                        map.put("isShown", 0);
                    }
                    map.put("days", days);
                    map.put("destList", destList);
                    list.add(map);
                    break;
                case "7~9天":
                    if (shopType != null && shopType == 1) {
                        destList = proProductMapper.getDestinationByTourDays(userId, 7, 9);
                    } else {
                        destList = volunteerProductMapper.getDestinationByTourDays(orgId, 7, 9);
                    }
                    if (destList != null && destList.size() > 0) {
                        map.put("isShown", 1);
                    } else {
                        map.put("isShown", 0);
                    }
                    map.put("days", days);
                    map.put("destList", destList);
                    list.add(map);
                    break;
                case "10天以上":
                    if (shopType != null && shopType == 1) {
                        destList = proProductMapper.getDestinationByTourDays(userId, 10, 100);
                    } else {
                        destList = volunteerProductMapper.getDestinationByTourDays(orgId, 10, 100);
                    }

                    if (destList != null && destList.size() > 0) {
                        map.put("isShown", 1);
                    } else {
                        map.put("isShown", 0);
                    }
                    map.put("days", days);
                    map.put("destList", destList);
                    list.add(map);
                    break;
            }
        }
        return list;
    }

    @Override
    public Response newProductlist(ProSearchCondition proSearchCondition) {
        int end = (proSearchCondition.getStart() + 1) * proSearchCondition.getSize();
        int begin = proSearchCondition.getStart() * proSearchCondition.getSize();
        proSearchCondition.setSize(0);
        List<ProductListDto> productListDtos = null;
        if (proSearchCondition.getMarketType() != null && proSearchCondition.getMarketType() == 1) {
            //查询促销产品
            productListDtos = proProductMapper.newProductListByPromotion(proSearchCondition);
        } else {
            //查询正常产品
            productListDtos = this.searchProToStream(proSearchCondition);
        }
        if (productListDtos != null && productListDtos.size() > 0) {
            List<ProductListDto> productListDtos1 = null;
            if (end >= productListDtos.size()) {
                productListDtos1 = productListDtos.subList(begin, productListDtos.size());
                return new Response().success(productListDtos1, productListDtos.size());
            } else {
                productListDtos1 = productListDtos.subList(begin, end);
                return new Response().success(productListDtos1, productListDtos.size());
            }

        } else {
            return new Response().success(new ArrayList<>(), 0);
        }
    }

    @Override
    public Response newProductAndDest(ProSearchCondition proSearchCondition) {
        proSearchCondition.setSize(0);
        List<ProductListDto> productListDtos = null;
        if (proSearchCondition.getShopType() != null && proSearchCondition.getShopType() == 1) {
            log.info("志愿者·目的地-产品查询接口");
            proSearchCondition.setDataStatus(1);
            productListDtos = volunteerProductMapper.selectVolProductManage(proSearchCondition);
        } else {
            productListDtos = this.searchProToStream(proSearchCondition);
        }
        if (productListDtos != null && productListDtos.size() > 0) {
            List<NewProductAndDestDto> newProductAndDestDtos = new ArrayList<>();
            Map<String, List<ProductListDto>> map = productListDtos.stream().collect(Collectors.groupingBy(ProductListDto::getDestination));
            for (String key : map.keySet()) {
                NewProductAndDestDto newProductAndDestDto = new NewProductAndDestDto();
                newProductAndDestDto.setDestination(key);
//                newProductAndDestDto.setProductList(map.get(key));
                newProductAndDestDtos.add(newProductAndDestDto);
            }
            return new Response().success(newProductAndDestDtos);
        }
        return new Response().success(new ArrayList<>());
    }

    @Override
    public Response newProductListByPromotion(ProSearchCondition proSearchCondition) {
        long time1 = System.currentTimeMillis();
        List<ProductListDto> productListDtos = proProductMapper.newProductListByPromotion(proSearchCondition);
        log.info("执行时间{}", System.currentTimeMillis() - time1);
        return new Response().success(productListDtos);
    }

    /**
     * 　　* @Description: 通过集合的stream实现多条件筛选，提高查询效率
     * 　　* @author 周陈
     * 　　* @date 2019/5/7 17:28
     *
     */
    public List<ProductListDto> searchProToStream(ProSearchCondition proSearchCondition) {
        //从redis中取出缓存数据
        List<ProductListDto> productListDtos = null;
        String redisKey = StringUtil.h5IndexRedisKey(proSearchCondition.getOrgId(), proSearchCondition.getSiteId());
        String proStr = redisClient.get(redisKey);
        if (StringUtils.isNotBlank(proStr)) {
            productListDtos = JSON.parseArray(proStr, ProductListDto.class);
        } else {
            //全部查询，去掉多余查询条件,保留siteid、orgId
            ProSearchCondition searchAll = new ProSearchCondition();
            searchAll.setOrgId(proSearchCondition.getOrgId());
            searchAll.setSiteId(proSearchCondition.getSiteId());
            productListDtos = proProductMapper.selectProBySiteAndOrdId(proSearchCondition.getSiteId(), proSearchCondition.getOrgId());
            if (productListDtos == null || productListDtos.size() == 0) {
                return null;
            }
            //写入redis，缓存十分钟，2019年5月6日 10:01:09
            redisClient.set(redisKey, JSON.toJSONString(productListDtos), 300);
        }

        List<ProductListDto> collect = new ArrayList<>();
        int size = proSearchCondition.getTags() != null ? proSearchCondition.getTags().size() : 0;
        collect = productListDtos.stream().filter(productListDto ->
                (StringUtils.isNotBlank(proSearchCondition.getKeywords()) ? productListDto.getAliaseName().contains(proSearchCondition.getKeywords()) : true) &&
                        (StringUtils.isNotBlank(proSearchCondition.getProType()) ? productListDto.getProTypeId().contains(proSearchCondition.getProType()) : true) &&
                        (StringUtils.isNotBlank(proSearchCondition.getDestination()) ? productListDto.getDestination().contains(proSearchCondition.getDestination()) : true) &&
                        (StringUtils.isNotBlank(proSearchCondition.getDeparture()) ? productListDto.getDeparture().contains(proSearchCondition.getDeparture()) : true) &&
                        (StringUtils.isNotBlank(proSearchCondition.getRouteTypeId()) ? productListDto.getProCategoryID().equals(proSearchCondition.getRouteTypeId()) : true)
        ).filter(productListDto ->
                //出团天数筛选
                Objects.nonNull(proSearchCondition.getDays()) && proSearchCondition.getDays().size() > 0
                        ? proSearchCondition.getDays().contains(productListDto.getTourDays()) : true
        ).filter(productListDto ->
                //产品标签筛选
                (size - 1 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 1)) : true) ||
                        (size - 2 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 2)) : false) ||
                        (size - 3 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 3)) : false) ||
                        (size - 4 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 4)) : false) ||
                        (size - 5 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 5)) : false) ||
                        (size - 6 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 6)) : false) ||
                        (size - 7 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 7)) : false) ||
                        (size - 8 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 8)) : false) ||
                        (size - 9 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 9)) : false) ||
                        (size - 10 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 10)) : false) ||
                        (size - 11 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 11)) : false) ||
                        (size - 12 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 12)) : false) ||
                        (size - 13 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 13)) : false) ||
                        (size - 14 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 14)) : false) ||
                        (size - 15 >= 0 ? productListDto.getTags().contains(proSearchCondition.getTags().get(size - 15)) : false)
        ).filter(productListDto ->
                //价格上线筛选，需要判断userTyp,1取salePrice\2取directPrice
                (Objects.nonNull(proSearchCondition.getHighPrice()) ?
                        (proSearchCondition.getUserType() == 2 ?
                                productListDto.getDirectPrice().compareTo(new BigDecimal(proSearchCondition.getHighPrice())) <= 0
                                : productListDto.getSalesPrice().compareTo(new BigDecimal(proSearchCondition.getHighPrice())) <= 0)
                        : true)
        ).filter(productListDto ->
                //价格下限筛选，需要判断userTyp,1取salePrice\2取directPrice
                (Objects.nonNull(proSearchCondition.getLowPrice()) ?
                        (proSearchCondition.getUserType() == 2 ?
                                productListDto.getDirectPrice().compareTo(new BigDecimal(proSearchCondition.getLowPrice())) >= 0
                                : productListDto.getSalesPrice().compareTo(new BigDecimal(proSearchCondition.getLowPrice())) >= 0)
                        : true)
        ).collect(Collectors.toList());
        return collect;
    }

}
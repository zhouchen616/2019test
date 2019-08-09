package com.holyrobot.constant;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author 周陈
 * @Title: 常量类
 * @date 2018/5/15 16:46
 */
public class Constants {
    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final int WX_PAY = 2;
    public static final int TICKET_STOCK = 999;

    //SqlServer 对语句的条数和参数的数量都有限制，分别是 1000 和 2100。
    public static final int SQL_MAX_COUNT = 2100;
    //session过期时间
    public static final int session_expire_time = 43200;
    public static final String[] TOUR_DAYS = {"2~3天", "4~6天", "7~9天", "10天以上"};
    /**
     * redis key
     */
    //产品类型
    public static final String REDIS_PRODUCT_TYPE = "NTFox_ProductType";


    /**
     * 　　* @Description: 对象插入SqlServer最大条数 = 数据库单条sql允许插入最大数量 /  对象字段数量  - 5（为了避免异常，减去五条）
     * 　　* @author 周陈
     * 　　* @date 2019/3/21 9:07
     */
    public static int pojoMaxSizeInSql(Class<?> t) {
        return SQL_MAX_COUNT / t.getDeclaredFields().length - 5;
    }


    //线路类型
    public static final String REDIS_ROUTE_TYPE = "NTFox_RouteType";

    //目的地
    public static String getRedisDestination(String siteId, Integer aliasId) {
        return "NTFox_" + siteId + "_" + aliasId + "_Destination";
    }

    public static final String UUID_DEFAULT = "00000000-0000-0000-0000-000000000000";

    //一级目的地父Id
    public static final String STAIR_DESTINATION_PARENT_ID = "00000000-0000-0000-0000-000000000000";

    public static final String[] PRO_TYPES = {"跟团游", "自由行", "半自由行"};
    /**
     * 平台保障 platformSecurity
     * 预订帮助 bookingHelp
     * 安全指南 securityGuide
     */
    public static final String[] DOC_HELPS = {"platformSecurity", "bookingHelp", "securityGuide"};


    /**
     * ES索引字段名
     */
    /***********product索引************/
    public static final String ES_PRODUCT_INDEX_NAME = "p_pro_product";

    public static final String ES_PRODUCT_TYPE_NAME = "p_pro_product";

    public static final String ES_PRODUCT_ID = "iD";

    public static final String ES_PRODUCT_PRO_TYPE_ID = "proTypeID";

    public static final String ES_PRODUCT_PRO_TYPE = "proType";

    public static final String ES_PRODUCT_PRO_CATEGORY_ID = "proCategoryID";

    public static final String ES_PRODUCT_PRO_SCOPE = "scope";
    public static final Integer ES_PRODUCT_PRO_PRODUCT = 1;
    public static final String ES_PRODUCT_IS_PUBLIC = "isPublic";
    //isPublic true已发布
    public static final Boolean ES_IS_PUBLIC_TRUE = true;

    //销售范围：1：web分销商城；2：h5微商城
    public static final List<Integer> ES_SCOPE_WEB = Arrays.asList(1);
    public static final List<Integer> ES_SCOPE_H5 = Arrays.asList(2);

    //返回null
    public static final String ES_PRODUCT_RETURN_NULL = "Ex2j5rNJ4GrZGMd7";

    public static final String ES_PRODUCT_PRO_CATEGORY = "proCategory";
    public static final String ES_PRODUCT_PRO_PROP = "proProp";
    public static final String ES_PRODUCT_PRO_NAME = "proName";

    public static final String ES_PRODUCT_ALIASE_NAME = "aliaseName";

    public static final String ES_PRODUCT_PRO_NO = "proNo";

    public static final String ES_PRODUCT_TOUR_DAYS = "tourDays";

    public static final String ES_PRODUCT_START_DAYS = "startDate";

    public static final String ES_PRODUCT_DUE_DATE = "dueDate";

    public static final String ES_PRODUCT_DEPARTURE = "departure";

    public static final String ES_PRODUCT_DESTINATION = "destination";

    public static final String ES_PRODUCT_PRO_TAG = "proTag";

    public static final String ES_PRODUCT_FEATURE = "feature";

    public static final String ES_PRODUCT_FEE_INCLUDES = "feeIncludes";

    public static final String ES_PRODUCT_FEE_NON_INCLUDES = "feeNonIncludes";

    public static final String ES_PRODUCT_TRAVEL_NAME = "travelName";

    public static final String ES_PRODUCT_BRAND_NAME = "brandName";

    public static final String ES_PRODUCT_IS_ACK = "isAck";

    public static final String ES_PRODUCT_IS_TAIL = "isTail";


    public static final String ES_PRODUCT_DATA_STATUS = "dataStatus";

    public static final String ES_PRODUCT_ORG_ID = "orgID";

    public static final String Es_PRODUCT_PRICE = "defaultPrice";

    public static final String Es_PRODUCT_SITE = "sites.sitename";

    /**********tour索引*********/
    public static final String ES_TOUR_INDEX_NAME = "p_pro_product_tour";

    public static final String ES_TOUR_TYPE_NAME = "p_pro_product_tour";

    public static final String ES_TOUR_ID = "id";
    public static final String ES_TOUR_IS_TAIL = "isTail";

    public static final String ES_TOUR_PRO_ID = "proid";

    public static final String ES_TOUR_TOUR_ID = "tourid";

    public static final String ES_TOUR_SITE_ID = "siteID";

    public static final String ES_TOUR_SITE_NAME = "siteName";

    public static final String ES_TOUR_NO = "tourNo";

    public static final String ES_TOUR_NAME = "tourName";

    public static final String ES_TOUR_DATE = "tourDate";

    public static final String ES_TOUR_DUE_DATE = "dueDate";

    public static final String ES_TOUR_PLAN_NUM = "planNum";

    public static final String ES_TOUR_MIN_NUM = "minNum";

    public static final String ES_TOUR_SEAT_NUM = "seatNum";

    public static final String ES_TOUR_STATUS = "tourStatus";

    public static final String ES_TOUR_DATE_YEAR = "tourDate_year";

    public static final String ES_TOUR_DATE_MONTH = "tourDate_month";

    public static final String ES_TOUR_DATE_DAY = "tourDate_day";

    public static final String ES_TOUR_DATE_HOUR = "tourDate_hour";

    public static final String ES_TOUR_DATE_MINUTE = "tourDate_minute";

    public static final String ES_TOUR_DATE_SECOND = "tourDate_second";

    public static final String ES_TOUR_PRICE = "price";

    public static final String ES_TOUR_SINGLE_ROOM_PRICE = "singleroomprice";

    public static final String ES_TOUR_REBATE = "rebate";

    public static final String ES_TOUR_SALE_PRICE = "saleprice";
    public static final String ES_TOUR_DIRECT_PRICE = "directprice";

    public static final String ES_TOUR_QTY = "qty";

    /**
     * 数据状态 off 未通过
     */
    public static final Integer DATA_STATUS_OFF = 1;
    /**
     * 数据状态 on 已通过
     */
    public static final Integer DATA_STATUS_ON = 2;

    /**
     * cookie name
     */
    public static final String COOKIE_TOKEN = "token";

    /**
     * cookie ageTime
     */
    public static final Integer COOKIE_EXPIRE = 7200;

    /**
     * Token
     */
    public static String TOKEN = "LTyQINrYurYcXZe";

    public static String INIT_TOKEN = "RRDOqVCcBqjOHm4O";

    /**
     * 存放鉴权信息的Header名称
     */
    public static String httpHeaderName = "header_token";

    public static String requestHeaderName = "access-control-request-headers";
}

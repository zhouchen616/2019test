package com.holyrobot.dto;

/**
 * @author 周陈
 * @Title: 业务类型操作类
 * @date 2019/3/16 14:45
 */
public class BusinessTypes {
    public static String ZTS = "ZTS";
    public static String PFS = "PFS";
    public static String DJS = "DJS";

    public static Integer ZTS_TYPE=1;
    public static Integer PFS_TYPE=2;
    public static Integer DJS_TYPE=3;

    public static Integer getBusinessTypes(String businessTypes){
        if(businessTypes==null || businessTypes.equals("")){
            return ZTS_TYPE;
        }

        if(businessTypes.contains(ZTS)){
            return ZTS_TYPE;
        }else if(businessTypes.contains(PFS)){
            return PFS_TYPE;
        }else if(businessTypes.contains(DJS)){
            return DJS_TYPE;
        }
        return ZTS_TYPE;
    }
}

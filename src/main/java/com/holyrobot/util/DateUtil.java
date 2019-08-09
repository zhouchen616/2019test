
package com.holyrobot.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description: TODO
 * @author 汤玉林
 * @date 2018年3月27日 下午3:35:55
 */
public class DateUtil {
    static SimpleDateFormat simpleDateFormat;

    /**
     * @Author: 周相儒
     * @Description: 根据身份证计算年龄
     * @Date:  2018/8/13
     * @return: int
     * @Param: cardNo
     */
    public static int getAge(String cardNo){
        String bir="";
        if (18 == cardNo.length()) {
            bir = cardNo.substring(6, 10);
            SimpleDateFormat df = new SimpleDateFormat("yyyy");
            String year=df.format(new Date());
            return Integer.parseInt(year) - Integer.parseInt(bir);
        }else{
            bir = cardNo.substring(6, 8);
            return Integer.parseInt(bir);
        }
    }

    public static String DateToString(Date source, String pattern) {
        simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(source);
    }

    public static Date stringToDate(String source, String pattern) {
        simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = simpleDateFormat.parse(source);
        } catch (Exception e) {
        }
        return date;
    }


    /**
     *
     * @Description 获取当前日期后几个月的日期的每一月
     * @author 汤玉林
     * @date 2018年5月15日 下午5:28:17
     * @action getCalendarMonth
     * @param format 格式化日期（yyyy-MM）
     * @param date 当前日期
     * @param dateline 距当前日期的几个月
     * @return
     */
    public static List<String> getCalendarMonth(String format,Date date,int dateline){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        List<String> dateList = new ArrayList<>();
        String startDate = sdf.format(date);
        Calendar min = Calendar.getInstance();
        try {
            min.setTime(sdf.parse(startDate));
            Calendar max = Calendar.getInstance();
            max.setTime(min.getTime());
            max.add(Calendar.MONTH, dateline);
            while (min.before(max)) {
                dateList.add(sdf.format(min.getTime()));
                min.add(Calendar.MONTH, 1);

            }
        } catch (ParseException e) {

            e.printStackTrace();
        }

        return dateList;
    }

    /**
     * @Author: zhouxiangru
     * @Description: 计算时间差
     * @Date: 2018/5/18
     * @return: getNum
     * @Param: []
     */
    public static  int getNum(Date startTime, String hours, String times) {

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String format = sdf1.format(startTime);
        String start = format+" "+hours;//拼接时间
        Calendar calendar = Calendar.getInstance();
        String [] strings = times.split(":");

        Date startDate = null;//格式化时间
        Date finDate = null;
        Date startfinDate = null;
        try {
            startDate = sdf2.parse(start);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(startDate);//设置时间
        calendar.add(Calendar.HOUR,Integer.parseInt(strings[0]));
        calendar.add(Calendar.MINUTE,Integer.parseInt(strings[1]));
        try {
            finDate =  sdf1.parse(sdf1.format(calendar.getTime()));
            startfinDate = sdf1.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long fin = finDate.getTime();
        long des = startfinDate.getTime();
        int i = (int)(fin - des)/(1000*3600*24);

        return i;

    }

    /**
     * 获取系统年份
     * @return
     */
    public static String getYear(){
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
        int year = cal.get(Calendar.YEAR);
        return String.valueOf(year);
    }

    public static void main(String[] args) {
        List<String> calendarMonth = DateUtil.getCalendarMonth("yyyy-MM", new Date(), 4);
        System.out.println();
    }
}

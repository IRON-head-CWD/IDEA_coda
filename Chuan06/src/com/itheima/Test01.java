package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        String birthday="1995年8月21日";
        String today="2021年4月1日";
        SimpleDateFormat sdf=new SimpleDateFormat("yyy年MM月DD日");
        long birthdayTime=sdf.parse(birthday).getTime();
        long TodayTime=sdf.parse(today).getTime();
        long dayNum=(TodayTime-birthdayTime)/(1000*60*60*24);
        System.out.println("dayNum="+dayNum);
    }
}

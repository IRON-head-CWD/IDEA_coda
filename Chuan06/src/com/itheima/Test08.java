package com.itheima;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test08 {
    /*
    2. 题目二
请编写程序，从控制台分别接收两个“生日”，
格式：yyyy 年 MM 月 dd 日，程序要能够计算
打印：第一个生日大于/小于第二个生日。
注意：要求验证生日日期必须早于当前日期
说明：张三同学生日是 1999年1月1日，李四同学生日是1999年1月2日，
那么张三大于李四

     */
    public static void main(String[] args)throws Exception {
        String now = "2020年8月14日";
        String birthday1 = "1999年1月1日";
        String birthday2 = "1999年1月2日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d1 = sdf.parse(now);
        Date d2 = sdf.parse(birthday1);
        Date d3 = sdf.parse(birthday2);
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        long time3 = d3.getTime();
        long dayNum = (time3 - time2) / (1000 * 60 * 60 * 24);
        if(dayNum>0){
            System.out.println("dayNum =time3big"+dayNum);
        }
       else{
            System.out.println("dayNum = time2big"+dayNum);
        }

    }
}

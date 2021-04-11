package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test07 {
    /*
    1. 题目一
请编写程序，从控制台接收一个“生日”，
格式：yyyy-MM-dd，程序要能够计算并打印, 他来到世界 xx 天。
注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
*/
    public static void main(String[] args) throws ParseException {
        String birthday = "1995年8月21日";
        String today = "2021年4月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月DD日");
        long birthdayTime = sdf.parse(birthday).getTime();
        long TodayTime = sdf.parse(today).getTime();
        long dayNum = (TodayTime - birthdayTime) / (1000 * 60 * 60 * 24);
        System.out.println("dayNum=" + dayNum);
    }
}
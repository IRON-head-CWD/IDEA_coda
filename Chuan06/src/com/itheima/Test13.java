package com.itheima;

import java.util.Calendar;

public class Test13 {
    /*
   2. 题目二
请编程，计算并打印“1949 年 10 月 1 日”那天是星期几？
    */
    public static void main(String[] args) {
        // (1). 获取到对象
        Calendar cal = Calendar.getInstance();

        // (2). 设置出生那一天的时间点
        cal.set(Calendar.YEAR, 1949);
        cal.set(Calendar.MONTH, 10);   //备注:月份从0开始
        cal.set(Calendar.DAY_OF_MONTH, 1);

        // (3). 星期几呢?
        int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("week = " + week);
    }
}

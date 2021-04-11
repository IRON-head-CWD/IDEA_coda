package com.itheima;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test10 {
    /*
    4. 题目四
请编写程序，从控制台接收一个“日期”，格式：yyyy-MM-dd，
程序将其转换为：xxxx年 xx 月 xx 日的格式输出到控制台。
     */
    public static void main(String[] args) throws Exception{
        Date d1 = new Date();
        System.out.println("d1 = " + d1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s1 = sdf.format(d1);
        System.out.println("s1 = " + s1);
    }
}

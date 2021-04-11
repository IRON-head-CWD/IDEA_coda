package com.itheima;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test09 {
    /*
    3. 题目三
请在控制台以“xxxx 年 xx 月 xx 日 xx 时 xx 分 xx 秒”的格式打印当前系统时间。
     */
    public static void main(String[] args) throws Exception{
        Date d1 = new Date();
        System.out.println("d1 = " + d1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String s1 = sdf.format(d1);
        System.out.println("s1 = " + s1);
        Date d2 = sdf.parse(s1);
        System.out.println("d2 = " + d2);
        long time = d2.getTime();
        System.out.println("time = " + time);
    }
}

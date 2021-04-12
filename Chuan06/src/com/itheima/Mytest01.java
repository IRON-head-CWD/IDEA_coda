package com.itheima;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mytest01 {
    public static void main(String[] args) throws Exception {
        //查看当前日期
        Date d1 = new Date();
        System.out.println("d1 = " + d1);
        //更改日期形式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //生成的Value用变量去接
        String s1 = sdf.format(d1);
        System.out.println("s1 = " + s1);
        //String转Data形式
        Date d2 = sdf.parse(s1);
        System.out.println("d2 = " + d2);
        //1970年1月1日至今的毫秒
        //查看当前的毫秒值
        long time = d2.getTime();
        System.out.println("time = " + time);

    }
}

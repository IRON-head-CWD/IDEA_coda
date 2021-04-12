package com.itheima;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MyTest02 {
    public static void main(String[] args) throws Exception {
       Date d1=new Date();
        System.out.println(d1);
        SimpleDateFormat sdf=new SimpleDateFormat("ffff-ff-ff");
        String s1=sdf.format(d1);
        System.out.println(s1);
        Date d2=sdf.parse(s1);
        System.out.println(d2);
        long time=d2.getTime();
        System.out.println(time
        );


    }
}

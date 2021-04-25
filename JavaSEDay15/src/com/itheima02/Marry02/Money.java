package com.itheima02.Marry02;

public class Money {
    //    public static int money=10000;
    //解决小皮不能改变变量问题
    public static volatile int money = 10000;
    public static Object lock=new Object();
}


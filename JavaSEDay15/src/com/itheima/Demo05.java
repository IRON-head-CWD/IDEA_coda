package com.itheima;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo05 {
    //private static int count=0;
    private static AtomicInteger integer=new AtomicInteger();
    public static void main(String[] args) {
        //开100条线程
        for (int i = 0; i < 100; i++) {
            //lambad表达式
            new Thread(()->{
                for (int j = 0; j <100 ; j++) {
                    //CAS算法
                    int count = integer.incrementAndGet();
                    System.out.println("送出第"+count+"个");
                }
            }).start();
        }
    }
}

package com.itheima02.Marry;

public class Demo {
    public static void main(String[] args) {
        MyThread01 t1=new MyThread01();
        t1.setName("小路同学");
        t1.start();
        MyThread02 t2=new MyThread02();
        t2.setName("小pi同学");
        t2.start();
    }
}

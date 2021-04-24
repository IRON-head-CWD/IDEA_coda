package com.itheima06.homeWork02;

public class Test02 {
    public static void main(String[] args) {
        //创建一个对象
        MyThread mt=new MyThread();
        //命名
        mt.setName("heima");
        //创建一个线程对象并传入mt参数
        Thread t1 = new Thread(mt);
        //运行
        t1.start();
    }
}

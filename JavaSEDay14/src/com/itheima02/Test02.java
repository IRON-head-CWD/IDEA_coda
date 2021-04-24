package com.itheima02;

public class Test02 {
    public static void main(String[] args) {
        //创建一个参数对象
        MyRunnable mr=new MyRunnable();
        //创建一个线程对象并传入mr参数
        Thread t1=new Thread(mr);
        t1.start();

        Thread t2=new Thread(mr);
        t2.start();
    }
}

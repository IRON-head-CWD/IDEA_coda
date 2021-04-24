package com.itheima06.homeWork03;

import com.itheima02.MyRunnable;

public class Test {
    public static void main(String[] args) {
        //创建一个参数对象
        MyRunnable mr=new MyRunnable();
        //创建一个线程对象并传入mr参数
        Thread t1=new Thread(mr);
        //命名
        t1.setName("heima");
        t1.start();

        Thread t2=new Thread(mr);
        t2.setName("baima");
        t2.start();
    }
}

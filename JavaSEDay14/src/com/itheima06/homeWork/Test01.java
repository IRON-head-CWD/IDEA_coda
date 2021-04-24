package com.itheima06.homeWork;

public class Test01 {
    public static void main(String[] args) {
        //创建对象
        MyThread mt = new MyThread();
        //命名
        mt.setName("heima");
        //创建一个线程对象并传入mt参数
        Thread t1 = new Thread(mt);
        //线程运行
        t1.start();

      //  mt.setName("baima");
        Thread t2=new Thread(mt);

        t2.start();
    }
}

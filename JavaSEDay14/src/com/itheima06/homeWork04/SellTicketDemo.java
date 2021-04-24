package com.itheima06.homeWork04;

public class SellTicketDemo {
    public static void main(String[] args) {
        //创建一个对象
        SellTricket st = new SellTricket();
        // 创建一个线程对象并传入mr参数
        Thread t1=new Thread(st);
        t1.setName("窗口1");

        Thread t2=new Thread(st);
        t1.setName("窗口2");

        Thread t3=new Thread(st);
        t1.setName("窗口3");

        //线程执行
        t1.start();
        t2.start();
        t3.start();


    }
}

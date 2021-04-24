package com.itheima04;

public class Demo {
    public static void main(String[] args) {
        //创建对象
        SellTicket st = new SellTicket();

        //线程对象
        Thread t1 = new Thread(st);
        t1.setName("窗口一");

        Thread t2 = new Thread(st);
        t2.setName("窗口二");

        Thread t3 = new Thread(st);
        t3.setName("窗口三");
       //线程执行
        t1.start();
        t2.start();
        t3.start();

    }
}

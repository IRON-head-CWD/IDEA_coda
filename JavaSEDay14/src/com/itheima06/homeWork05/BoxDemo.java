package com.itheima06.homeWork05;
//测试类
public class BoxDemo {
​
    public static void main(String[] args) {
        //创建唯一的锁对象, 奶箱
        Box box = new Box();
        //创建线程实现类的对象
        Productor p = new Productor(box);
        Customer c = new Customer(box);
        // --------
        //创建线程
        Thread t1 = new Thread(p, "送奶工");
        Thread t2 = new Thread(c, "消费者");
        t1.start();
        t2.start();
    }
}

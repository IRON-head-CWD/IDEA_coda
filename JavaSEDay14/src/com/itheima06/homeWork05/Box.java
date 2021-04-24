package com.itheima06.homeWork05;
//表示第x瓶奶，提供存储牛奶和获取牛奶的操作
//奶箱
public class Box {
    //奶箱的状态 和 奶箱的天数数目
    private boolean state = false;
    private int milk;
​
    //存奶操作
    public synchronized void put(int milk) throws Exception {
        // (1). 判断
        if (state == true) {
            wait();
        }
        // (2). 变化
        this.milk = milk;
        System.out.println("送奶工送奶,奶数:" + milk);
        // (3). 修改
        state = true;
        // (4). 唤醒
        notifyAll();
    }
​
    //取奶操作
    public synchronized void get() throws Exception {
        // (1). 判断
        if (state == false) {
            wait();
        }
        // (2). 变化
        System.out.println("消费者取奶,奶数:" + milk);
        // (3). 修改
        state = false;
        // (4). 唤醒
        notifyAll();
    }
}


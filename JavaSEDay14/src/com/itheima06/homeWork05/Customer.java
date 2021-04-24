package com.itheima06.homeWork05;

//实现Runnable接口，重写run()方法，调用获取牛奶的操作
//消费者
public class Customer implements Runnable {
    ​
    private Box box;
​
    public Customer(Box box) {
        this.box = box;
    }
​
    @Override
    public void run() {
        while (true) {
            //----------------
            //不断的取奶操作
            try {
                box.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //----------------
        }
    }
}


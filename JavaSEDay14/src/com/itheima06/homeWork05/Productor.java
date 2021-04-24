package com.itheima06.homeWork05;

//实现Runnable接口，重写run()方法，调用存储牛奶的操作
//生产者
public class Productor implements Runnable {​
    private Box box;
    public Productor(Box box) {
        this.box = box;
    }​
    @Override
    public void run() {
        for (int i = 1; i < 31; i++) {
            //----------------
            //调用方法,送奶
            try {
                box.put(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //----------------
        }
    }
}

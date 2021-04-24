package com.itheima02;

public class Test01 {
    public static void main(String[] args) {
       MyThread mt1=new MyThread();
       mt1.setName("niam");
       mt1.start();

       MyThread mt2=new MyThread();
       mt2.setName("nidad");
       mt2.start();
    }
}

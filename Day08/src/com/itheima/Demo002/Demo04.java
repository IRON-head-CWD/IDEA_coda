package com.itheima.Demo002;

public class Demo04 {
    public static void main(String[] args) {
        Phone p=new Phone();
        System.out.println(p);
        p.brand="华为";
        p.price=5999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call("肖战");
        p.sendMsg();

    }
}

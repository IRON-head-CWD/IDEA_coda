package com.itheima.Demo002;

public class Phone {
    String brand;
    int price;
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    public void sendMsg(){
        System.out.println("拿着品牌为："+brand+"的价格"+price+"的手机发短信");
    }
}

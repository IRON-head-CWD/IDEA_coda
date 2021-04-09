package com.itheima.Demo004;

public class Phone02 {
    public static void main(String[] args) {
        Phone01 s=new Phone01("小米","黑色",3899);
        System.out.println("正在使用价格为"+3998+"元"+ s.getColor()+"的"+s.getBrand()+"手机打电话");
        System.out.println("正在使用价格为"+3998+"元"+ s.getColor()+"的"+s.getBrand()+"手机发短信");
    }
}

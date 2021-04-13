package com.itheima;

public class Test01 {
    public static void main(String[] args) {
        //在 Java 继承当中 成员变量的访问特点
        ZiLei zi=new ZiLei();
        System.out.println(zi.name);
        System.out.println(zi.ageFu);
        System.out.println(zi.ageZi);
        System.out.println("--------------");
        zi.show();
    }
}

package com.itheima.test01.test03;

public class fu {
    String name;
    int age;
    public fu(){
        System.out.println("父类无参构造");
    }

    public fu(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类有参构造");
    }

}

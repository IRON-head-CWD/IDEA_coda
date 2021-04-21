package com.itheima03;

public class Test07 {
    public static void main(String[] args) {
        //实现类
        Dog01 version01=new Dog01();
        version01.eat();
        System.out.println("====================");
        //多态类
        Animal01 version02=new Dog01();
        version02.eat();
        System.out.println("====================");
        //创建匿名内部类
        Animal01 version03=new Animal01() {
            @Override
            public void eat() {
                System.out.println("gouchi");
            }
        };
        version03.eat();
    }
}

package com.itheima03;

public class Test01 {
    public static void main(String[] args) {
        Cat c=new Cat();
        System.out.println(c.name);
        System.out.println(c.age);
        c.name="魔法猫咪";
        System.out.println("-------------------");
        final Cat c1=new Cat("Tom");
        System.out.println("c1="+c1);
        System.out.println(c1.name);
        c1.name="加菲猫";
        System.out.println("c1="+c1);
    }
}

package com.itheima03;

public class Test05 {
    public static void main(String[] args) {
        Outer ooo=new Outer();
        System.out.println(ooo.name);

        System.out.println("*/****************");

        Outer.Innter oi=new Outer().new Innter();
        System.out.println(oi.name);
        System.out.println("------------");
        oi.show();
    }
}

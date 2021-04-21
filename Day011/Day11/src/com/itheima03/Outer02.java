package com.itheima03;

public class Outer02 {
    public void show() {
        int age = 33;
        System.out.println(age);
    }

    public void say() {
        class Inner {
            String name = "赵兴";

            public void method() {
                System.out.println("局部内部类的method");
            }
        }
        Inner ii = new Inner();
        System.out.println(ii.name);
        ii.method();
    }
}

package com.itheima.homework03;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("public...Student...无参构造方法");
    }

    public Student(String name) {
       // this.name = name;
        System.out.println("name的值为:" + name);
        System.out.println("private...Student...有参构造方法");
    }
    public Student(String name, int age) {
        System.out.println("name的值为:" + name + "age的值为:" + age);
        System.out.println("public...Student...有参构造方法");
    }
}
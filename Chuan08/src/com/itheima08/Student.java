package com.itheima08;

public class Student {
    String name;
    public Student() {
        System.out.println("学生，无参数构造方法----");
    }
    public Student(String name) {
        this.name = name;
        System.out.println("学生，带参数name构造方法---");
    }
    public void show() {
        System.out.println("学生展示---");
    }
    {
        System.out.println("渣渣灰");
    }
}

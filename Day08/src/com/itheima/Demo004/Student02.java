package com.itheima.Demo004;

public class Student02{
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 12;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.study();
        System.out.println(stu);
    }
}

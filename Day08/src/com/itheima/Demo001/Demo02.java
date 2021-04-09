package com.itheima.Demo001;

public class Demo02 {
    public static void main(String[] args) {
        Demo01 stu=new Demo01();
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.name="张三";
        stu.age=15;
        System.out.println(stu.name);
        System.out.println(stu.age);
        stu.study();
        stu.sleep();
    }
}

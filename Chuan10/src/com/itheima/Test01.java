package com.itheima;

import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        HashSet<Student> stu=new HashSet<>();
        stu.add(new Student("nima",18));
        stu.add(new Student("nima",18));
        stu.add(new Student("nima",18));
        stu.add(new Student("nima",18));
        stu.forEach(s-> System.out.println(s));


    }
}

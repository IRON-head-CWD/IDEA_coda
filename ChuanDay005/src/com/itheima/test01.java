package com.itheima;

import java.util.Objects;

public class test01 {
    public static void main(String[] args) {
        Teacher t1=new Teacher("gailun",18);
        Teacher t2=new Teacher("gailun",18);
        Teacher t3=new Teacher("gailun",18);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println("-----------");
        System.out.println(Objects.equals(t1,t2));
    }
}

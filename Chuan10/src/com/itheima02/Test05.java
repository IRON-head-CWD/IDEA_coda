package com.itheima02;


import java.util.HashSet;

public class Test05 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("迪丽热巴", 23));
        hs.add(new Student("迪热", 23));
        hs.add(new Student("迪丽热", 23));
        hs.add(new Student("热巴", 23));
        hs.add(new Student("迪巴", 23));
        hs.forEach(stu -> System.out.println(stu));

    }
}

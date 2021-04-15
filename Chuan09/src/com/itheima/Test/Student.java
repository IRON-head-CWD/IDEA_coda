package com.itheima.Test;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public int compareTo(Student o){
        int result =o.age-this.age;
        result=(result==0)?this.name.compareTo(o.name):result;
        return result;
    }
    public Student(String zhangsan, int i) {}
}

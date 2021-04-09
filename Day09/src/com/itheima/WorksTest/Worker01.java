package com.itheima.WorksTest;
public class Worker01 {
    // 成员变量
    private String name;
    private int year;

    // 构造方法
    public Worker01() {

    }
    public Worker01(String name, int age) {
        this.name = name;
        this.year = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
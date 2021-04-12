package com.itheima;

public class Test06 {
    private String name;
    private int age;

    public Test06() {
    }

    public Test06(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test06{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

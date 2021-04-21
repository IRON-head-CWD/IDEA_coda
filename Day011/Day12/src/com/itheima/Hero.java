package com.itheima;

public class Hero {

        private String name;
        private int age;

    public Hero() {
    }

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

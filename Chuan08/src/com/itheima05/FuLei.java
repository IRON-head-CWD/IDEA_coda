package com.itheima05;

public abstract class FuLei {
    String name;
    int age;

    public FuLei() {
    }

    public FuLei(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
}

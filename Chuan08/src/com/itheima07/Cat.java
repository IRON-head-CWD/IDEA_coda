package com.itheima07;

public class Cat {
    String name="汤姆";
    final int age=3;
    public Cat(){
    }

    public Cat(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
}

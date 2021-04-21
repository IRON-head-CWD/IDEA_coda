package com.itheima03;

public class Cat {
    String name="Tom";
    final int age=3;
    public Cat(){

    }
    public Cat (String name){
        this.name=name;
    }
    //发现没有一个方法，setAge只有getAge()
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

package com.itheima04;

public class Dog extends Animal {
    //抽象方法必须重写
    @Override
    public void eat(){
        System.out.println("dog eat");
    }
}

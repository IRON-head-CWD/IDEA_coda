package com.itheima.outClass;

public class Test {
    public static void main(String[] args) {
        Cat one=new Cat();
        one.eat();
        Animal two= new Cat();
        two.eat();
        Animal three=new Animal() {
            @Override
            public void eat() {
                System.out.println("fish");
            }
        };
        three.eat();
    }
}

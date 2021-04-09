package com.itheima.test01.test03;

public class zi extends fu {
    String gender;

    public zi() {
        System.out.println("子类无参构造");
    }

    public zi(String name, int age,String gender) {
        this.name = name;
        this.age = age;
        System.out.println("子类有参构造");
    }
    public void show(){
        System.out.println(name+","+age+","+gender);
    }
}
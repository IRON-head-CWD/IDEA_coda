package com.itheima.test01.test07;
//抽象
public abstract  class Man {
    //参数
     String number;
    String name;
    String sex;
  String old;
//无参构造
    public Man() {
    }

    public Man(String number, String name, String sex, String old) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.old = old;
    }
    //抽象方法
    public abstract void eat();
}

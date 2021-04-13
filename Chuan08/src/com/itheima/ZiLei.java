package com.itheima;

public class ZiLei extends FuLei{
    String name="思聪";
    int ageZi=30;
    public void show(){
        String name="万达";
        System.out.println(name);
        //直接找 子类成员变量。  this.变量名称
        System.out.println(this.name);
        //直接找 父类成员变量。  super.变量名称
        System.out.println(super.name);
    }
}

package com.itheima.Test02;

public class Test05 {
    public static void main(String[] args) {
        //创建实现类的对象采用多态的写法，左父右子
        JieKou<String> jk=new ShiXianLei<>();
        jk.methodAbstract("Type?");
        System.out.println("--------------");
        //创建实现类的对象
        ShiXianLei<Integer> sxl=new ShiXianLei<>();
        sxl.methodAbstract(666);
    }
}

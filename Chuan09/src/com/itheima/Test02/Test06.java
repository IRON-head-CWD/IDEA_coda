package com.itheima.Test02;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        //准备collection的对象
        ArrayList<Number> array01 = new ArrayList<>();
        array01.add(10);
        array01.add(10);
        array01.add(10);
        //再次准备一下参数
        ArrayList<Integer> array02 = new ArrayList<>();
        array02.add(111);
        array02.add(222);
        //将两个内容存放在一起
        array01.addAll(array02);
        // 展示数据
        array01.forEach(num -> System.out.println(num));
        System.out.println("--------------------------");
        array02.forEach(num -> System.out.println(num));
    }
}

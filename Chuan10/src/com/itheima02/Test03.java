package com.itheima02;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        //可变参数集合使用of(...)方法 JDK9
        List<Integer> small = List.of(11, 22, 33, 44, 55);
        System.out.println("small=" + small);

        //可以将small作为参数，传递big.
        List<Integer> big = new ArrayList<>(small);
        System.out.println("big=" + big);
        big.add(777);
        big.add(88);
        System.out.println("big=" + big);

    }
}

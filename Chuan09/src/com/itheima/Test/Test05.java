package com.itheima.Test;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Number> one=new ArrayList<>();
        one.add(11);
        one.add(11);
        one.add(11);
        ArrayList<Integer> two=new ArrayList<>();
        two.add(12);
        two.add(12);
        two.add(12);
        ArrayList<Object> three=new ArrayList<>();
        three.add(13);
        three.add(13);
        three.add(13);
        one.addAll(two);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}

package com.itheima.WorksTest;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        String s1="aaa,bbb,ccc";
        String[] s1Arr=s1.split(",");
        System.out.println(Arrays.toString(s1Arr));
String s2="aaa.bbb.ccc";
        String[] s2Arr=s1.split("\\.");
        System.out.println(Arrays.toString(s2Arr));
    }
}

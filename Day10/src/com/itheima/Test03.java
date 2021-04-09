package com.itheima;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print( list.get(i)+"\t");
        }
    }
}

package com.itheima02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("javase");
        hs.add("javase");
        hs.add("javase");
        hs.add("javase");
        hs.add("javase");
        hs.add("javase");
        System.out.println("-----1.迭代器-----");
        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next);
        }
        System.out.println("-----2.增强for-----");
        for (String s : hs) {
            System.out.println(s);
        }
        System.out.println("----3.lambad----");
        hs.forEach(s-> System.out.println(s));
    }
}

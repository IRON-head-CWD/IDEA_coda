package com.itheima.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
    public static void main(String[] args) {
        Set<String> ts=new TreeSet<>();
        ts.add("helloworld");
        ts.add("world");
        ts.add("helworld");
        ts.add("helorld");
        System.out.println(ts);
        //迭代器
        Iterator <String>iterator=ts.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            System.out.println(next);
        }
//lambad
        ts.forEach(s -> System.out.println(s));
        //for增强
        for(String s:ts){
            System.out.println(s);
        }
    }

}

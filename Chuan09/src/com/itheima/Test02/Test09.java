package com.itheima.Test02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test09 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");
        list.add("php");
        list.add("Hello");
        Set<String> set=new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        list.forEach(s-> System.out.println(s));
    }
}

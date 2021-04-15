package com.itheima.Test;

import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("helloworld");
        array.add("helloworld");
        array.add("helloworld");
        array.add("helloworld");
        array.add("helloworld");
        array.add("helloworld");
        System.out.println(array);
        TreeSet<String> ts=new TreeSet<>();
        ts.addAll(array);
        System.out.println(ts);
        System.out.println(array);
        array.clear();
        array.addAll(ts);
        System.out.println(array);

    }
}

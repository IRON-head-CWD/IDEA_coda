package com.itheima.Test;

public class Test04 {
    public static void main(String[] args) {
        NBLinkList<String> nb=new NBLinkList<>();
        nb.add("hello");
        nb.add("Java");
        nb.add("sss");
        String oldTou=nb.updateFirst("JAVASE");
        String oldWei=nb.updateLast("JAVAME");
        System.out.println(oldTou);
        System.out.println(oldWei);
        System.out.println(nb);
    }
}

package com.itheima;

public class Test08 {
    public static void main(String[] args) {
        NBLinkedList nb=new NBLinkedList();
        nb.add("aaaa");
        nb.add("aaaa");
        nb.add("aaaa");
        nb.add("aaaa");
        nb.add("aaaa");
        Object oldHead=nb.updateFirst("AAAA");
        Object oldWei=nb.updateLast("AAAA");
        System.out.println(oldHead);
        System.out.println(oldWei);
        System.out.println(nb);
    }
}

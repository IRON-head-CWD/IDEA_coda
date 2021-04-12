package com.itheima;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Test07 {
    public static void main(String[] args) {
        LinkedList<String> linked=new LinkedList<>();
        linked.add("aaaa");
        linked.add("bbbb");
        linked.add("cccc");
        linked.add("dddd");
        System.out.println(linked);
        linked.removeFirst();
        linked.addFirst("AAAA");
        System.out.println(linked);
    }
}

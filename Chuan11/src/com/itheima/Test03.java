package com.itheima;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        list<String> array=new ArrayList<>();
        array.add("张三丰");
        array.stream().filter(s->startWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
    }
}

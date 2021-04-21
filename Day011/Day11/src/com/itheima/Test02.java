package com.itheima;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("666");
        Map<String,Integer> map=list.stream().filter(
                s -> {String[] split=s.split(",");
                int age=Integer.parseInt(split[1]);
                return age>=24;
                }
        ).collect(Collectors.toMap(
                s->s.split(",")[0],
                s->Integer.parseInt(s.split(",")[1])
        ));
        System.out.println(map);
    }
}

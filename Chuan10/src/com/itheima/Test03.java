package com.itheima;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("令狐冲", "东方菇娘");
        map.put("尹志平", "小龙女");
        map.put("西门庆", "武大郎");
        Scanner sc=new Scanner(System.in);
        System.out.println("456");
        String key=sc.next();
         String value=map.get(key);
        value= (value==null)?"System.out.println(456)":value;
        System.out.println(value);

    }
}

package com.itheima02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test06 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("冠希","柏芝");
        map.put("冠希","柏芝");
        map.put("冠希","柏芝");
        map.put("冠希","柏芝");
        System.out.println("-----1.keySet()-----");
        Set<String> strings=map.keySet();
        for(String key:strings){
            //通过key找到value
            String value=map.get(key);
            System.out.println("丈夫："+key+",媳妇"+value);
        }
        System.out.println("------2..entrySet()--------");
        Set<Map.Entry<String,String>> entries=map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println("丈夫："+key+",媳妇"+value);
        }

        System.out.println("------3.lambad--------");
        map.forEach((key,value)-> System.out.println("丈夫："+key+",媳妇" + value));
    }
}

package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("令狐冲", "东方菇娘");
        map.put("尹志平", "小龙女");
        map.put("西门庆", "武大郎");
        System.out.println("========[1]KeySet========");
        Set<String> strings = map.keySet();
        for (String key:strings){
            String value=map.get(key);
            System.out.println();
            System.out.println("丈夫:" + key + ",媳妇:" + value);
        }
        System.out.println("---[2]entrySet---");
        Set<Map.Entry<String,String>>entries=map.entrySet();

    }
}

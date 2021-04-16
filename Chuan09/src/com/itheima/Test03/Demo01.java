package com.itheima.Test03;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Demo01 {
    public static void main(String[] args) {
        //input string
        Scanner sc = new Scanner(System.in);
        System.out.println("input an String:");
        String str = sc.nextLine();
        //MAP of Collection
        TreeMap<Character, Integer> map = new TreeMap<>((o1, o2) -> o2 - o1);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char key = charArray[i];
            if (map.containsKey(key)) {
                Integer value = map.get(key);
                value++;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("字符:" + key + ",出现了" + value + "次");
        }
    }
}

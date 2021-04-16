package com.itheima;

import java.util.HashMap;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a number:");
        String line=sc.nextLine();
        HashMap <Character,Integer> map=new HashMap<>();
        for (int i = 0; i <line.length() ; i++) {
            char c=line.charAt(i);
            if(map.containsKey(c)) {
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            }else{
                map.put(c,1);
            }
        }
        map.forEach((key,value)-> System.out.println("字符"+key+"出现了"+value));
    }
}

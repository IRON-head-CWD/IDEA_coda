package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        Iterator<String> iter=c.iterator();
        while(iter.hasNext()){
            String next=iter.next();
            System.out.println(next);
        }
        System.out.println("---------------");
        for(String s:c){
            System.out.println(s);
        }System.out.println("--------------");
        c.forEach(s-> System.out.println(s));
    }
}

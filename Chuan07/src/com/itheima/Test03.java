package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("JavaSE");
        c.add("JavaSE");
        c.add("JavaSE");
        Iterator<String> iter=c.iterator();
        while(iter.hasNext()){
            String next=iter.next();
            System.out.println(next);
        }
    }
}

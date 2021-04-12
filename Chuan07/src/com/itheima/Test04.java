package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("JavaSE");
        c.add("JavamE");
        c.add("JavaeE");
        Iterator<String> iter =c.iterator();
        while(iter.hasNext()){
            String next=iter.next();
            if (next.contains("SE")){
                iter.remove();
            }
        }
        System.out.println(c);
    }

}

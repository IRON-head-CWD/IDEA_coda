package com.itheima;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Baby {
    public static void main(String[] args) {
        Collection<Test06> c=new ArrayList<>();

        c.add(new Test06("迪丽热巴",20));
       c.add(new Test06("迪丽热巴",20));
        c.add(new Test06("迪丽热巴",20));
        System.out.println("1.bianli");
        Iterator<Test06> iter=c.iterator();
        while(iter.hasNext()){
           Test06 next=iter.next();
            System.out.println(next);
        }
        System.out.println("2.forzengqiang");
        for(Test06 stu:c){
            System.out.println(c);
        }
        System.out.println("3.");
        c.forEach(num-> System.out.println(c));
        System.out.println();
    }


}

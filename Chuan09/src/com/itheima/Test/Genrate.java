package com.itheima.Test;

import java.util.ArrayList;
import java.util.Collection;

public class Genrate {
    public static void main(String[] args) {
       // ArrayList<String> list=new ArrayList<>();
        Collection<Integer> c=new ArrayList<>();
        c.add(11);
        c.add(33);
        c.add(55);
        Integer[] array=c.toArray(new Integer[c.size()]);
        for (Integer num:array){
            System.out.println(num);
        }

    }
}

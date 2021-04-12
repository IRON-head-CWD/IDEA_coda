package com.itheima;

import java.util.ArrayList;
import java.util.Collection;

public class Test02 {
    public static void main(String[] args) {
        Collection<String > c=new ArrayList<>();
        c.add("JavaSE");
        c.add("JavaSE");
        c.add("JavaSE");
        c.removeIf(s ->s.contains("EE"));
        System.out.println("c="+c);
    }
}

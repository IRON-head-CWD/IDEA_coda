package com.itheima.Test02;

import java.util.HashSet;

public class Test08 {
    public static void main(String[] args) {
        HashSet<Test07> set=new HashSet<>();
        set.add(new Test07("华为派",8999) );
        set.add(new Test07("xiaomu",8999) );
        set.add(new Test07("vio",8999) );
        set.add(new Test07("oppo",8999) );
        set.forEach(p-> System.out.println(p));
    }
}

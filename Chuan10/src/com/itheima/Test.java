package com.itheima;

import java.nio.file.DirectoryIteratorException;
import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<String> ha=new HashSet<>();
        ha.add("尼玛");
        ha.add("尼玛de");
        ha.add("尼玛");
        ha.add("八岁就长这样了");
        Iterator<String> iterator = ha.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            System.out.println(next);
        }

    }
}

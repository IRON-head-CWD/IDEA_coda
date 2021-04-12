package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HomeTest06 {
    public static void main(String[] args) {
        /*
        请定义一个 Collection 类型的集合，存储以下字符串：
“JavaEE 企业级开发指南”，
”Oracle 高级编程”，
”MySQL 从入门到精通”,
”Java 架构师之路”
请编程实现以下功能：
使用迭代器遍历所有元素，并打印
使用迭代器遍历所有元素，筛选书名小于 10 个字符的，并打印；
使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名

         */
        Collection<String> c=new ArrayList<>();
        c.add("JavaEE 企业级开发指南");
        c.add("Oracle 高级编程");
        c.add("MySQL 从入门到精通");
        c.add("Java 架构师之路");
        System.out.println("-----1.迭代器------");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
        }
        System.out.println("---2.增强for循环-----");
        for(String s:c){
            System.out.println(s);
        }
        System.out.println("=====3.Lambda======");
        c.forEach(s-> System.out.println(s));

    }
}

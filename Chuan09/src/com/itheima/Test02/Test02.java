package com.itheima.Test02;

import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        //创建对象
        GoodLinkedList list = new GoodLinkedList();
         //添加数据
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("萨瓦迪卡");
        list.add("迪丽热巴");
        list.add("萨瓦迪卡");
        //查看结果
        list.forEach(s-> System.out.println(s));
        System.out.println("----------------");
        Object tou=list.updateFirst("撒悠啦啦");
        System.out.println("tou="+tou);
        Object wei=list.updateLast("蒙娜丽莎");
        System.out.println("wei="+wei);
        list.forEach(s-> System.out.println(s));
      /*  Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            */
        }
    }



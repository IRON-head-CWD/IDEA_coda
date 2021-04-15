package com.itheima.Test02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("萨瓦迪卡");
        list.add("迪丽热巴");
        list.add("萨瓦迪卡");
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            System.out.println(next);
        }
    }
}

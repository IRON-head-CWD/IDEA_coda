package com.itheima;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("曹丕");
        list.add("张飞");
        list.add("缪化");
        list.add("曹丕");
        for (int i = 0; i < list.size(); i++) {
          String s=list.get(i);
          if("张飞".equals(list)){
              list.remove(i--);
          }
        }
        System.out.println(list);
    }
}

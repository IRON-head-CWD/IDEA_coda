package com.itheima;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        //构造一个初始容量为 10 的空列表。
        ArrayList<Students> list=new ArrayList<>();
        //创建4个Students数组
        Students s1=new Students("曹丕",16);
        Students s2=new Students("诸葛亮",16);
        Students s3=new Students("刘备",16);
        Students s4=new Students("张飞",16);
//
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (int i = 0; i < list.size(); i++) {
            Students stu=list.get(i);
            System.out.println(stu.getAge()+"****"+stu.getName());
            
        }
    }
}

package com.itheima;

import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person s1 = new Person("张三", 3000);
        Person s2 = new Person("李四", 3500);
        Person s3 = new Person("王五", 4000);
        Person s4 = new Person("赵六", 4500);
        Person s5 = new Person("田七", 5000);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        //判断是否有王五，如果有，改名为王小五；
        //判断是否有赵六，如果有，删除赵六；
        //给田七加500；
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            if ("王五".equals(p.getName())) {
                p.setName("王小五");
                list.set(i, p);
            }
            if ("赵六".equals(p.getName())) {
                list.remove(i--);
            }
            if ("田七".equals(p.getName())) {
                p.setSalary(p.getSalary()+500);
                list.remove(i--);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Person p=list.get(i);
            System.out.println("姓名："+p.getName()+","+"工资："+p.getSalary());
        }
    }
}
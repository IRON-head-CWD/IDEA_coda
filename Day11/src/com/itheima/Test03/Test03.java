package com.itheima;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();
        User s1 = new User("张三", "男", 18);
        User s2 = new User("李四", "男", 20);
        User s3 = new User("王五", "男", 24);
        User s4 = new User("赵六", "男", 25);
        User s5 = new User("田七", "男", 26);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for (int i = 0; i < list.size(); i++) {
            User p = list.get(i);
            if ("女".equals(p.getName())) {
                list.remove(i--);
            }
            if (18<p.getAge()) {
                list.remove(i--);
            }
        }
            for (int i = 0; i < list.size(); i++) {
                User p = list.get(i);
                System.out.println("姓名：" + p.getName() + "," + "性别" + p.getSex()+"年龄"+p.getAge());
            }
        }
    }

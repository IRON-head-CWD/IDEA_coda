package com.itheima.WorksTest;


import java.util.Scanner;

public class Worker02 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工人姓名：");
        String name = sc.nextLine();
        System.out.println("请输入工人工龄：");
        int year = sc.nextInt();
        // 创建对象
        Worker01 w = new Worker01 (name, year);
        // 输出信息
        System.out.println("该工人对象的信息如下：");
        System.out.println("姓名：" + w.getName());
        System.out.println("工龄：" + w.getYear());
    }
}
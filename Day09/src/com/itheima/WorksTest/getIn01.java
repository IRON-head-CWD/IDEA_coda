package com.itheima.WorksTest;

import java.util.Scanner;

public class getIn01 {
    public static void main(String[] args) {
        String usreName="张三";
        int passWorld=123456;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工人姓名：");
        String name = sc.nextLine();
        System.out.println("请输入工人工龄：");
        int year = sc.nextInt();
    }
}

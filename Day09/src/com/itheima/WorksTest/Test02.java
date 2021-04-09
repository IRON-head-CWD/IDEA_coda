package com.itheima.WorksTest;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String str=sc.nextLine();
        String replace=str.replace("TMD","***");
        System.out.println(replace);
    }
}

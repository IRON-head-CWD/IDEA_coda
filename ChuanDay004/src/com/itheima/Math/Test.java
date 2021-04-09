package com.itheima.Math;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please inport a data");
        int r=sc.nextInt();
        double area=Math.PI*Math.pow(r,2);
        System.out.println(area);
    }
}

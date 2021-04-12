package com.itheima;

import java.text.ParseException;
import java.util.Scanner;

public class homeTest01 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("plsase input two number:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = a / b;
        method(b);
        if(b!=0){
            System.out.println(c);
        }
    }

    public static void method(double b)  {
        if (b == 0) {
            System.out.println("第二个数不能为零");
        }
    }
}
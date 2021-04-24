package com.itheima;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter purchase amount:");
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println("sales tax is $"+(int)(tax*100)/100.0);
    }
}

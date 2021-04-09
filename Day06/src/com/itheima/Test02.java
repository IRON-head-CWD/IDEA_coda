package com.itheima;

import java.util.Scanner;

/*

 */
public class Test02 {
    public static void main(String[] args) {
        isEvenNum(10);
        isOddNum(11);
        isNum();
    }
    public static void isEvenNum(int num) {
        if(num%2==0){
        System.out.println("偶数");
        }
    }public static void isOddNum(int num){
        if(num%2!=0){
        System.out.println("奇数");
        }
    }public static void isNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please importing a data:");
        int x= sc.nextInt();
        if(x%2!=0){
        System.out.println("奇数");
        }
        else{System.out.println("偶数");
        }
    }
}

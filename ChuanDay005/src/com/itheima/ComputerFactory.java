package com.itheima;

import java.util.Scanner;

public class ComputerFactory {
    public static void main(String[] args) {
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.println("please import a number:");
            int n=input.nextInt();
            System.out.println( n*factory(n-1));
        }
    }
    public static int factory(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factory(n-1);
        }
    }
}

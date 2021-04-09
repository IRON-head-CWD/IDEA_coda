package com.itheima.Day03;
/*
猜数字大小
 */
import java.util.Scanner;
import java.util.Random;

public class DayTest11 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum =r.nextInt(100)+1;
        System.out.println(randomNum);
        while(true){
            System.out.println("Please importing a data:");
            int num=sc.nextInt();
            if(num>randomNum){
                 System.out.println("so big!");
            }else if (num<randomNum){
                System.out.println("so little!");
            }else{
                System.out.println("just it!!");
                break;
            }
        }System.out.println("Thanks for your,,");
    }
}

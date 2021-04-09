package com.itheima.Day03;
/*1、【编号：301】 需求：键盘录入一个星期数(1,2,...7)，输出对应的星期一，星期二，...星期日*/
import java.util.Scanner;
public class DayTest01 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("plesae importing a number:");
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Relink again!11");
                break;


        }

    }
}

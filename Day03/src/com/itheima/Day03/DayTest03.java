package com.itheima.Day03;
/*
3、【编号：304】 模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。 要求：​键盘录入三个整数，其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，运行效果如下:
请输入第一个整数：
10
请输入第二个整数：
20
请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)
3
10 * 20 = 200
*/
import java.util.Scanner;

public class DayTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plesae importing the first data:");
        int i = sc.nextInt();
        System.out.println("plesae importing the second data:");
        int j = sc.nextInt();
        System.out.println("plesae importing the third data:");
        int k = sc.nextInt();
        switch (k) {
            case 1:
                System.out.println(i + " + " + j + " = " + 5);
                break;
            case 2:
                System.out.println(i + " - " + j + " = " + 6);
                break;
            case 3:
                System.out.println(i + " * " + j + " = " + 200);
                break;
            case 4:
                System.out.println(i + " / " + j + " = " + 8);
                break;
            default:
                System.out.println("Bad guy!");
                break;
        }

    }
}
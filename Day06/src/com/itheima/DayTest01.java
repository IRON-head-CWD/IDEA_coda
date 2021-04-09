package com.itheima;

import java.util.Scanner;

public class DayTest01 {
    public static void main(String[] args) {
        //键盘输入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("Please importing a number:");
        int num = sc.nextInt();
        //明确参数；
        boolean b = isOdd(num);
        System.out.println(b);

    }
       //方法
    public static boolean isOdd (int num) {

        //判断
        if (num % 2 != 0) {
            return  true;
        } else {
            return  false;
        }
    }

}

package com.itheima;
/*
6、【编号：607】 已知一个数组 arr = {19, 28, 37, 46, 50};
 键盘录入一个数据。定义一个方法，
完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
 */

import java.util.Scanner;

public class DayTest06 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[]{19, 28, 37, 46, 50};
        //调用数组？？？
        int j = Index(arr);
        System.out.println(j);

    }

    public static int Index(int[] arr) {
        //键入
        Scanner sc = new Scanner(System.in);
        System.out.println("Please importing a data:");
        int num = sc.nextInt();
        int index = 0;
        //遍历、判断
        for (int i = 0; i < arr.length - 1; i++) {
            if (num > arr[i]) {
                num = arr[i + 1];
                index = i + 1;
            }
            break;
            if (num < arr[i]) {
                num = arr[i];
                index = i;

            }
            break;
            if (num > arr.length - 1 || num < 0) {
                index = -1;

            }
        }//返回值
        return index;

    }
}

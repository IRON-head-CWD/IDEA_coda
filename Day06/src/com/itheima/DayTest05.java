package com.itheima;

import java.util.Scanner;

public class DayTest05 {
    public static void main(String[] args) {
        //创建数组
        int[] arr = new int[]{11, 22, 33, 44, 55, 66};
        int[] maxAndMin = newArray(arr);
        System.out.print(maxAndMin[0]);
        System.out.println(maxAndMin[1]);
    }

    public static int[] newArray(int[] arr) {

        //键入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("please import tow datas：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (true) {
            if (x > arr.length || y > arr.length) {
                System.out.println("Importing again!");
            }
            break;
        }
        arr[0] = arr[x];
        arr[1] = arr[y];


        int[] maxAndMin = {arr[0], arr[1]};
        return maxAndMin;
    }
}
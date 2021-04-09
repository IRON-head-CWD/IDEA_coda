package com.itheima;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
//利用随机数生成5个范围为2-10（包含2和10）之间的整数存入到数组中(随机数可重复)，之后分别求出数组的最大值、最小值以及数组总和并打印到到控制台
        //定义数组
        int[] arr = new int[5];
        Random random = new Random();
        System.out.println("生成的随机数组为:");
// 利用随机数生成5个范围为2-10（包含2和10）之间的整数存入到数组中(随机数可重复)
        //______________1_____________________
        int i = 0;
        for (; i < arr.length; i++) {
            i = random.nextInt(99) + 1;
        }
        System.out.println();
        maxAndMin(arr);
        //分别打印出最大值、最小值以及数组总和到控制台

    }


    public static void maxAndMin(int[] arr) {
        //定义变量
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        //求出最大值
        //______________2_____________________
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                arr[i] = max;
            }
            //求出最小值
            //______________3_____________________
            if (min > arr[i]) {
                arr[i] = min;
            }
        }
        //求累加和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println();
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("累加和为：" + sum);
    }
}





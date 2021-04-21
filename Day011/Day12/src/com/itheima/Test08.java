package com.itheima;

import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = {55, 28, 19, 37, 46};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        //外层for循环，控制次数。少比较一次
        for (int i = 0; i < arr.length; i++) {
            //内层for循环，实际比较的
            //-1数组不能越界
            //-i每次比较的时候都会少一个数据
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //查看结果
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}

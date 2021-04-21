package com.itheima;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        int[] arr={37,50,46,19,28,37};
        //验证toString（数组名称）
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("--------------------");
        //排序的操作sort（数组名称）
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("------------------");
        //查找元素binarySearch(数组名称，查找的元素)
        int index1= Arrays.binarySearch(arr,50);
        System.out.println("index1 = " + index1);
        //
        int index2=Arrays.binarySearch(arr,66);
        System.out.println("index2 = " + index2);
        //
        int index3=Arrays.binarySearch(arr,37);
        System.out.println("index3 = " + index3);
    }
}

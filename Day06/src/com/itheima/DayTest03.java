package com.itheima;

public class DayTest03 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = new int[]{400, 12, 36, 99, 88, 45};
        //调用方法中的数组
        int number = Max(arr);
        System.out.print(number);
    }

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

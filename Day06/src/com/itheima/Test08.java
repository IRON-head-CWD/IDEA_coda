package com.itheima;

public class Test08 {
    public static void main(String[] args) {
        //参数
        int[] arr = new int[]{11, 22, 55, 33, 69, 55, 44};
        //定义最大值，调用方法
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
}

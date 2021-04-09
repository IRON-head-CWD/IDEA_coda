package com.itheima;

public class Test09 {
    public static void main(String[] args) {
        //参数
        int[] arr = new int[]{11, 22, 55, 33, 69, 55, 44};
        //定义最值，调用方法{思考用什么去接收数据}
        int[] maxAndMin = getMaxAndMin(arr);
        System.out.println(maxAndMin[0]);
        System.out.println(maxAndMin[1]);
    }
    public static int[] getMaxAndMin(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                max = arr[i];
            }
        }
        int[] maxAndMin = {min, max};
        return maxAndMin;
    }
}
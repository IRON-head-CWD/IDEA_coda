package com.itheima;

public class DayTest04 {
    public static void main(String[] args) {
        //创建数组
        int[] arr = new int[]{45, 56, 89, 96, 96, 84, 848, 48, 48, 48, 48, 4};
        //用一个值来接方法返回值
        int min = getMin(arr);
        System.out.print(min);
    }

    public static int getMin(int[] arr) {
        int minn = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minn > arr[i]) {
                minn = arr[i];
            }
        }
        return minn;
    }
}

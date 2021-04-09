package com.itheima;

/*

 */
public class Demo01 {
    public static void revArray(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4, 5, 887, 97, 979};
        revArray(arr);
        System.out.println(arr);
    }
}

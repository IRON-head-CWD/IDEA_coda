package com.itheima;

import java.util.Arrays;

public class Test09 {
    public static void main(String[] args) {
        int[] arr={55,28,19,37,46};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        //调用方法
        quitSort(arr,0,arr.length-1);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }

    private static void quitSort(int[] arr, int left, int right) {
        //定义变量，存放2个数据值
        int left0=left;
        int right0=right;
        int baseNumber=arr[left];
        //循环
        while(left!=right){
            while(arr[right]>baseNumber&&right>left){
                right--;
            }
            //从右边往左边找数据
            while (arr[right]>baseNumber&&right>left){
                right--;
            }
            while (arr[left]<baseNumber&&right>left){
                left++;
            }
            int temp=arr[left];
            arr[left]=arr[left0];
            arr[left0]=temp;

        }
        int temp=arr[left];
        arr[left]=arr[left0];
        arr[left0]=                                                                                                                                                                                                                                                                                                                                                                                                                                       temp;
    }

}

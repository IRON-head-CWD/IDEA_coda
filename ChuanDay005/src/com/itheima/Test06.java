package com.itheima;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        int[] arr={1,54,4,48,8,984,56};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

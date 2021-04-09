package com.itheima;

import java.util.Arrays;
//快排
public class Test07 {
    public static void main(String[] args) {
        int[] arr={1,12,12,54,8,87,1,4,87,8,4};
        System.out.println(Arrays.toString(arr));
        //方法
        quitSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quitSort(int[] arr, int left, int right) {
      //  if(left>right){return;}
        int left0=left;
        int right0=right;
        int baseNumber=arr[left];
        while(left!=right){
            while(arr[right]>=baseNumber &&right>left){
                right--;
            }
            while (arr[left]<=baseNumber &&right<left){
                left++;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        int temp=arr[left];
        arr[left]=arr[left0];
        arr[left0]=temp;
       // quitSort(arr, left0, left-1);
       // quitSort(arr, left+1,right0);

    }
}

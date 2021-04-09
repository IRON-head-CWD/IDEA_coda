package com.itheima;
/*
现有如下数组：
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
1、请将数组中所有的元素，倒序放入一个新的数组中，并遍历新数组查看结果。
2、如果不定义新数组，在原来数组中实现将元素顺序反转，该怎样实现呢？
 */
public class Test05 {
    public static void main(String[] args) {
        //建立一个数组
       int[]arr=new int[]{1,2,3,4,5,6,7,8,9};
       //改变一个遍历思维：2端
        for (int start = 0,end= arr.length-1;start<end  ; start++,end--) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}

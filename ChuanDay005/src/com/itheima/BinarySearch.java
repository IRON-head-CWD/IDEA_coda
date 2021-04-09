package com.itheima;

public class BinarySearch {
    public static void main(String[] args) {
   int[] arr={1,2,3,5,989,9,97,9,9,};
   int num=9;

   //二分查找
   int index=binarySearchForIndex(arr,num);
        System.out.println(index);
    }
    //定义方法，定义参数、返回值
    public static int binarySearchForIndex(int[] arr,int number){
     int min=0;
     int max=arr.length-1;
     while(min<max){
         int mid=(min+max)>>1;
         if(arr[mid]>number){
             max=mid-1;
         }else if (arr[mid]<number){
             min=mid+1;
         }else{
             return mid;
         }
     }return -1*(arr.length+1);
    }
}

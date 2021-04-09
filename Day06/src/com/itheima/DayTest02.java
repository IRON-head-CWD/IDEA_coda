package com.itheima;

public class DayTest02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        //调用方法
        printArray(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void printArray(int[] arr) {
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //从顺序0开始到8，逢偶数加一
            if(i%2==0){
                arr[i]+=1;
            }else{
                arr[i]+=0;
            }
        }
    }
}

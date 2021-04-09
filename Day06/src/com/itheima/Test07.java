package com.itheima;

public class Test07 {
    public static void main(String[] args) {
        //建立数组
        int [] arr=new int[]{11,22,33,44};
        //调用方法
        printArray(arr);
    }
    public static void printArray(int[]arr) {
        //要求条件上有“[”符号
        System.out.print("[");
        //利用遍历
        for (int i = 0; i < arr.length; i++) {
            if(i== arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }

        }

    }
}

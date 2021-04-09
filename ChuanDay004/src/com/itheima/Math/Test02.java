package com.itheima.Math;

public class Test02 {
    public static void main(String[] args) {
        int[] arr1={1,5,959,59,59,5,95,9,59};
        int[] arr2=new int [15];
        System.arraycopy(arr1,0,arr2,0, arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+"\t");
        }
    }
}

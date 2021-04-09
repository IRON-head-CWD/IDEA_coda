package com.itheima;

public class Demo03 {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        int[]arr2={1,2,3};
        int[]arr3={1,2,3};
        int[][] arr={arr1,arr2,arr3};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                sum+=arr[i][i1];
            }

        } System.out.println(sum);
    }
}

package com.itheima;

public class Demo02 {
    public static void main(String[] args) {

        //定义二维数组
        int[][] arr=new int[][]{{1,2,3},{15,1,6,16,},{1,5,5,6,7}};
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.print(arr[i][i1]+"\t");
            }
        }
    }
}

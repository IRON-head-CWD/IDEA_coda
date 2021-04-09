package com.itheima;
/*
输出动态数组地址里的存储内容
 */


public class DayTest01 {
    public static void main(String[] args) {
        int [] arr=new int[5];
        System.out.println(arr);
        System.out.println("------------");
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(arr[0]);
    }
}

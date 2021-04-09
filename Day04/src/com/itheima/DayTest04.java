package com.itheima;
/*
输入数组计算数组元素和
 */
import java.util.Scanner;

public class DayTest04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1));
            int num=sc.nextInt();
            arr[i]=num;
        }int sum=0;
        for (int i = 0; i < arr.length; i++){
            sum+=arr[i];
    }System.out.println(sum);
    }
}

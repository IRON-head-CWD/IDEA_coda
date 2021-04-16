package com.itheima02;

public class Test01 {
    public static void main(String[] args) {
        int sum1=calc(10,20,30,40);
        System.out.println("sum1="+sum1);
        int sum2=calc(10,20,30,40,50);
        System.out.println("sum2="+sum2);
    }
    public static int calc(int...arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }
}

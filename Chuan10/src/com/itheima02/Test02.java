package com.itheima02;

public class Test02 {
    public static void main(String[] args) {
        int sum1=calc(10,200,30);
        System.out.println("----------");
        int sum2=calc(10,20,30,40,50);
    }
    public static int calc(int ...arr){
        System.out.println("arr="+arr);
        System.out.println("arr.getClass()="+arr.getClass());
        System.out.println("arr.length="+arr.length);
        return 0;
    }
}

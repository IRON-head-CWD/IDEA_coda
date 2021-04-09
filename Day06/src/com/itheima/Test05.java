package com.itheima;

public class Test05 {
    public static void main(String[] args) {
        int max=getMax(11,22);
        System.out.println(max);
        System.out.println(getMax(44,66));
    }
    public static int Max(int a,int b) {
        if (a>b){
            return a;
        }else{
            return b;
        }
    }public static int getMax(int a,int b){
        /*
        if (a>b){
        return a;
        }else{
        return b;
        }
         */
        return a>b?a:b;
    }
}

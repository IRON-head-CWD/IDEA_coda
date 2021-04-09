package com.itheima;
/*
方法重载
 */
public class Test06 {
    public static void main(String[] args) {
        int sum = Compare(10, 20);
        System.out.println(sum);
        System.out.println(Compare(1,2,3));
    }
    public static int Compare(int a, int b) {

        return a + b;
    }
    public static int Compare(int a, int b, int c) {
        return a + b + c;
    }
}

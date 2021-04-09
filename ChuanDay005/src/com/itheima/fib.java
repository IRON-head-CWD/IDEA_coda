package com.itheima;

public class fib {
    public static void main(String[] args) {
     int  sum= getSum(20);
        System.out.println(sum);
    }
    public static int getSum(int month) {
        if (month==1 || month == 2) {
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}

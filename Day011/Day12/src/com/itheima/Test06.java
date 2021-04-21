package com.itheima;

public class Test06 {
    public static void main(String[] args) {
        int result=jieCheng(5);
        System.out.println("result = " + result);
    }

    private static int jieCheng(int i) {
        if (i == 1) {
          return 1;
        }
        return i*jieCheng(i-1);
    }
}

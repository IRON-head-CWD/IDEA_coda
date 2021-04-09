package com.itheima;

public class Test03 {
    public static void main(String[] args) {
        print(10,100);
    }
    public static void print(int n, int m) {
        System.out.println(n + "到" + m + "之间的奇数有");
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.print(i+"\t");
            }
        }
    }
}

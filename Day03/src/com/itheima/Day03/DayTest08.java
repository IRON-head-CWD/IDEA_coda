package com.itheima.Day03;
/*
8、【编号：308】 请求出10的阶乘的值，并将该值在控制台输出。 阶乘：一个正整数n的阶乘 = 1 * 2 * 3 * ... * n。
 */

public class DayTest08 {
    public static void main(String[] args) {
        int pro=1;
        for (int i = 1; i <=10; i++) {

            pro=pro*i;

        } System.out.println(pro);
    }
}

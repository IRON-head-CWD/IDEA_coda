package com.itheima;
/*
小智买了一个存钱罐，他计划这样存钱：第一周存入10元，第二周存入20元，第三周存入30，依次每周递增10元。请编写程序帮助小智计算一下，一年（一年52周）之后，他的存钱罐中有多少钱
 */
public class Test01 {
    public static void main(String[] args) {
        //定义当前金额
        int money=10;
        //定义累加后一个星期金额
        int totalMoney=0;
        //定义52周
        for (int i = 1; i < 53; i++) {
            money=i*10;
            totalMoney+=money;

        }
        System.out.println(totalMoney);
    }
}

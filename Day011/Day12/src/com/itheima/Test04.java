package com.itheima;

import java.math.BigDecimal;

public class Test04 {
    public static void main(String[] args) {
        //创建2个对象
        BigDecimal number1=new BigDecimal("24.0");
        BigDecimal number2=new BigDecimal("8.0");
        //四则运算
        double valueJia=number1.add(number2).doubleValue();
        System.out.println("valueJia = " + valueJia);
        System.out.println("-----------------");
        double valueCheng=number1.multiply(number2).doubleValue();
        System.out.println("valueCheng = " + valueCheng);
        double valueChu=number1.divide(number2).doubleValue();
        System.out.println("valueChu = " + valueChu);
    }
}

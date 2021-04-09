package com.itheima;

import java.math.BigDecimal;

public class Test02 {
    public static void main(String[] args) {
        BigDecimal number1=new BigDecimal("9.1");
        BigDecimal number2=new BigDecimal("9.1");
        double result= number1.divide(number2).doubleValue();
        System.out.println("result="+result);
        result = number1.divide(number2, 2, BigDecimal.ROUND_UP).doubleValue();
    }
}

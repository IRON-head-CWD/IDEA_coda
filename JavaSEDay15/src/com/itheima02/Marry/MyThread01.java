package com.itheima02.Marry;

import com.itheima02.Marry.Money;

public class MyThread01 extends Thread{
    @Override
    public void run(){
        while(Money.money==10000){
        }
        System.out.println("结婚基金不是10万了");
    }
}

package com.itheima02.Marry;

import com.itheima02.Marry.Money;

public class MyThread02 extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Money.money=90000;
    }
}

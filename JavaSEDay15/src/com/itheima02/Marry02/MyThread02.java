package com.itheima02.Marry02;

import com.itheima02.Marry.Money;

public class MyThread02 extends Thread {
    @Override
    public void run() {
        synchronized (Money.lock) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Money.money = 90000;
        }
    }
}

package com.itheima02.Marry02;

import com.itheima02.Marry.Money;
/*
synchronized解决 :

	1 ，线程获得锁

	2 ，清空变量副本

	3 ，拷贝共享变量最新的值到变量副本中

	4 ，执行代码

	5 ，将修改后变量副本中的值赋值给共享数据

	6 ，释放锁

 */

public class MyThread01 extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Money.lock) {
                if (Money.money != 10000) {
                    System.out.println("结婚基金已经没有10万了");
                    break;
                }
            }
        }
    }
}

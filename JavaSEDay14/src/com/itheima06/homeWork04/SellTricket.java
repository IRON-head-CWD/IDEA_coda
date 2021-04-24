package com.itheima06.homeWork04;

public class SellTricket implements Runnable {
    //定义票数
    private int ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //锁对象，可以使用任意的对象，但是多条线程使用的锁对象必须唯一
            synchronized (obj) {
                //判断是否有票
                if (ticket <= 0) {
                    break;
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket--;
           String name= Thread.currentThread().getName();
            System.out.println(name+ "售出的票还剩" + ticket + "张");
        }
    }
}

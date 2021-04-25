package com.itheima;

import java.util.concurrent.CountDownLatch;

public class Demo07 {
    public static void main(String[] args) {
        CountDownLatch count=new CountDownLatch(3);
        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+"吃第"+i+"个饺子");
            }
            //执行完毕，计数器减一
            count.countDown();

        },"小白").start();
        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+"吃第"+i+"个饺子");
            }
            //执行完毕，计数器减一
            count.countDown();
        },"小蓝").start();

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName()+"吃第"+i+"个饺子");
            }
            //执行完毕，计数器减一
            count.countDown();
        },"小黑").start();

        new Thread(()->{
            try {
                count.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("开始收拾碗筷");
        },"妈妈").start();
    }
}

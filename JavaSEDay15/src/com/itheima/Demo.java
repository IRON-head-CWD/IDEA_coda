package com.itheima;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);
        new Thread(()->{
            while(true){
                try {
                    queue.put("汉堡");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            while (true){

                try {
                    System.out.println("顾客获取到一个"+queue.take()+"现在队列"+queue.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}

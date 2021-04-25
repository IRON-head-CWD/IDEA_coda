package com.itheima;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"线程启动"));
        Thread.sleep(20);
        executorService.submit(()-> System.out.println(Thread.currentThread().getName()+"线程启动"));
        executorService.shutdown();

    }
}

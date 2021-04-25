package com.itheima02.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test03 {
    //static ExecutorService newFixedThreadPool(int nThreads)
    //创建一个指定最多线程数量的线程池
    public static void main(String[] args) {
        //参数不是初始值而是最大值
        //创建一个指定10线程数量的线程池
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        //
        ThreadPoolExecutor pool=(ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize());
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        System.out.println(pool.getPoolSize());
        //executorService.shutdown();
    }
}

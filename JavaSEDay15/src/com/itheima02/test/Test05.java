package com.itheima02.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test05 {
    public static void main(String[] args) {
        /*
        明确线程池可执行的任务数=队列数+最大线程数
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                3,
                20,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        /*
        提交5个任务，线程最多可以处理4个任务，多余的利用AbortPolicy抛出异常
         */
        for (int i = 0; i < 5; i++) {
            //提交到线程任务
            threadPoolExecutor.submit(() ->
                    System.out.println(Thread.currentThread().getName() + "->" + "执行了任务")
            );
        }
    }
}

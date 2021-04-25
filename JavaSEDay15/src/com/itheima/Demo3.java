package com.itheima;

import java.util.concurrent.*;

public class Demo3 {
    public static void main(String[] args) {
        //自定义线程池
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                2,//核心线程数量
                5,//最大线程数
                10,//空闲线程最大存活时间
                TimeUnit.SECONDS,//时间单位
                new ArrayBlockingQueue<>(5),//任务队列
        Executors.defaultThreadFactory(),//创建线程工厂
        new ThreadPoolExecutor.AbortPolicy()//任务拒绝策略
        );
        for (int i = 0; i <100 ; i++) {
            //提交任务
            pool.submit(()-> System.out.println(Thread.currentThread().getName()+"线程启动"));

        }
    }
}

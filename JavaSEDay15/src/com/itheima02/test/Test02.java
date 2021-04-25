package com.itheima02.test;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02 {
    // static ExecutorSrvice newCached ThreadPool()
    //创建一个指定最多线程数量的线程池
    //static newFixedThreadPool(int nThreads)
    //创建一个指定最多线程数量的线程池
    public static void main(String[] args) {
        //1.创建一个默认的线程池对象，池子中默认是空的。默认最多可以容纳int类型的最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Executors--可以帮助我们创建线程池对象
        //ExecutorService--可以帮助我们控制线程池
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });
        //Thread.sleep(2000)
        executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在执行"));

        executorService.shutdown();
    }
}

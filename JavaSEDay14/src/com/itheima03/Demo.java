package com.itheima03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建Mycallable的对象
        //线程开启之后需要执行里面的call方法
        MyCallable mc = new MyCallable();
//可以获取线程执行完毕之后的结果，也可以作为参数传递给Thread的对象
        FutureTask<Integer> ft = new FutureTask(mc);
//创建线程对象
        Thread t1 = new Thread(ft);
//开启线程
        t1.start();

        Integer sum = ft.get();
        System.out.println("sum = " + sum);
    }
}

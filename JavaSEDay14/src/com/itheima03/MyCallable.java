package com.itheima03;

import java.util.concurrent.Callable;
//泛型表示线程执行完毕，返回的结果数据类型
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i <101 ; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+sum;
    }
}

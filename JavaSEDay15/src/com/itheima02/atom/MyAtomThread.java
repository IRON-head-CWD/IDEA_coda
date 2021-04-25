package com.itheima02.atom;

class MyAtomThread implements Runnable {
    private volatile int count = 0;//送冰淇凌的数量
    private  Object lock=new Object();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //从共享数据中心中读取数据到本线程栈中
            //修改本线程中变量副本的值
            //会把本线程栈中变量副本的值赋值给共享数据
            synchronized (lock){
                count++;
                System.out.println("已经送了"+count+"个冰淇凌");
            }
        }
    }
}
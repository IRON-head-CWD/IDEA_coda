package com.itheima02;

public class MyThread extends Thread {
 //子类
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+i);
        }
    }
}

package com.itheima06.homeWork;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+i);
        }
    }
}

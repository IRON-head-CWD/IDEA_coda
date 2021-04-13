package com.itheima06;

public abstract class Driver {
    public void run(){
        System.out.println("1.系上安全带");
        System.out.println("2.点火启动");
        go();
        System.out.println("4.熄火停车");
    }
    public abstract void go();
}

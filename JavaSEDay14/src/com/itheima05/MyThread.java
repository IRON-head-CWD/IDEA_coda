package com.itheima05;

public class MyThread  extends Thread{
    private Object obj=new Object();

    public MyThread() {
    }

    public MyThread( String name) {
        super( name);
    }
    static int ticket=100;
    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(ticket<=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

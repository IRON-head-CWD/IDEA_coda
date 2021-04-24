package com.itheima04;
/*
同步代码块
操作代码块加所
 */


import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    //定义成员变量表示票资源

    private int ticket = 100;//不同窗口
    //  private Object obj=new Object();
    ReentrantLock lock = new ReentrantLock();//锁对象

    @Override
    public void run() {
        //不停的卖票
        while (true) {
            try {
                lock.lock();
                //   synchronized (this)
                {//锁对象，可以使用任意的对象，但是多条线程使用的锁对象必须唯一
                    //判断是否有票
                    if (ticket <= 0) {
                        break;
                    }
                }

                try {
                    //t1休眠，t2休眠最后一张票卖了多次甚至在没有锁之前出现负数
                    Thread.sleep(100);//模拟卖票时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //售票
                ticket--;

            /*
            不是一个原子性操作
            1.拿到ticket原来的值
            2.做减一操作
            3.赋值回去

            某条线程获取到Ticket原来的值，做--；想赋值还没操作完毕，线程执行权就被其他线程抢走
            其他线程的ticket的值还是之前的值
            此时2条线程做赋值，得到的结果一样
             */
                //Thread.currentThread().getName()与setName相互呼应；
                System.out.println(Thread.currentThread().getName() + "售出的票还剩" + ticket + "张");
            } finally {//肯定会执行
                //释放资源
                lock.unlock();
            }
        }
    }
}
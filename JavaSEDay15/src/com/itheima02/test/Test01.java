package com.itheima02.test;
//Java .lang.Thread.State
public class Test01 {
    public enum State{
        //新建
        NEW,

        //可运行的
        RUNNABLE,

        //阻塞状态
        BLOCKED,

        //无限等待状态
        WAITTING,

        //计时等待、
        TIMED_WAITING,

        //终止 terminated
        TERMINATED,
    }
    /*

    //获取当前线程状态
    public State getState(){
       return jdk.internal.misc.VM.toThreadState(threadStatus);

    }
     */

}

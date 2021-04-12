package com.itheima;

public class Date {

    public transient long fastTime;

    public Date() {
        this(System.currentTimeMillis());
    }

    public Date(long date) {
        fastTime = date;
    }

    public long getTime() {
        return fastTime;
    }

    public void setTime(long time) {
        fastTime = time;
   //     cdate = null;
    }
}

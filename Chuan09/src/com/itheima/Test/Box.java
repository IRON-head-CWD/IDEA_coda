package com.itheima.Test;

public class Box<MVP> {
    private MVP mvp;

    public MVP getMvp() {
        System.out.println("get.Type"+mvp.getClass());
        return mvp;
    }

    public void setMvp(MVP mvp) {
        System.out.println("set..Type"+mvp.getClass());
        this.mvp = mvp;
    }
}

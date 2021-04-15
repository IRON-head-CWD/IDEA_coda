package com.itheima.Test02;

public class Box<NBA>{
    private NBA nba;

    public NBA getNba() {
        //查看当前的泛型，本质是什么类型
        System.out.println("get方法="+nba.getClass());
        return nba;
    }

    public void setNba(NBA nba) {
        this.nba = nba;
        //查看当前的泛型，本质类型
        System.out.println("set方法="+nba.getClass());
    }
}

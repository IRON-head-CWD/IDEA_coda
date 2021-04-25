package com.itheima02.Marry02;

import com.itheima02.Marry.MyThread01;
import com.itheima02.Marry.MyThread02;

public class Demo {
    public static void main(String[] args) {
        MyThread01 t1=new MyThread01();
        t1.setName("小路同学");
        t1.start();
        MyThread02 t2=new MyThread02();
        t2.setName("小皮同学");
        t2.start();
    }
}

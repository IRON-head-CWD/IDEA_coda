package com.itheima.intclass;

public class Test {
    public static void main(String[] args) {
        //调用内部类方法
        intClass.Heat c=new intClass().new Heat();
        c.jump();
       outClass a=new outClass();
        Leg();
    }

    private static void Leg() {
    }
}

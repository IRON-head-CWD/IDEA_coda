package com.itheima.launch;

public class method01 {
    public static void main(String[] args) {
        method(new jiekou(){

            @Override
            public void methodAbstract() {

            }
        });
    }

    public static void method(jiekou kou){
        kou.methodAbstract();
    }
}

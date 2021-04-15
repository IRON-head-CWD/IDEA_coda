package com.itheima.Test02;

public class Test04 {
    public static void main(String[] args) {
        method("type?");
        System.out.println("-----------");
        method(666);
        System.out.println("-----------");
        method(520.1314F);
    }
    public static <CCTV> void method(CCTV tv){
        System.out.println(tv);
        System.out.println("当前的类型是="+tv.getClass());
    }
}

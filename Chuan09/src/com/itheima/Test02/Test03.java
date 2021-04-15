package com.itheima.Test02;

public class Test03 {
    public static void main(String[] args) {
        //使用泛型===string
        Box<String>box1 =new Box<>();
        box1.setNba("pipi");
        String fanHuiZhi1=box1.getNba();
        System.out.println("famHuiZhi1="+fanHuiZhi1);
        System.out.println("------------------");
        //使用泛型==Double包装类
        Box<Double> box2=new Box<>();
        box2.setNba(13.14);
        Double fanHuiZhi2=box2.getNba();
        System.out.println("fanHuiZhi2="+fanHuiZhi1);
    }
}

package com.itheima.Test;

public class Test {
    public static void main(String[] args) {
        Box<Double> one=new Box<>();
        one.setMvp(3.1415);
        Double mvp1=one.getMvp();
        System.out.println("mvp1"+mvp1);
        System.out.println("---------");
        Box<Boolean> two=new Box<>();
        two.setMvp(true);
        Boolean mvp2=two.getMvp();
        System.out.println("mvp2"+mvp2);

    }
}

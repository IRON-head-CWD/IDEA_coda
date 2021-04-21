package com.itheima;


import java.util.Objects;

public class Test03 {
    public static void main(String[] args) {
        Hero h1=new Hero("gailun",20);
        String s1= Objects.toString(h1);
        System.out.println(s1);
        Hero h2=null;
        Hero h3=null;
        String s2=Objects.toString(h2,"嘻嘻孔明绘制");
        System.out.println(s2);
        System.out.println("-------------");
        //如果说，没有学习objects 那么我们直接使用方法比较
        boolean flag1=h1.equals(h2);
        System.out.println("flag1 = " + flag1);
        boolean flag3=Objects.equals(h1,h2);
        System.out.println("flag3 = " + flag3);
    }
}

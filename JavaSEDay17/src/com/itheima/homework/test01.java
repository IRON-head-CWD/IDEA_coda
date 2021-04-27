package com.itheima.homework;

public class test01 {
    public static void main(String[] args) {
       ClassLoader systemClasLoader= ClassLoader.getSystemClassLoader();
        ClassLoader clasLoaderParent = systemClasLoader.getParent();
        ClassLoader parent = clasLoaderParent.getParent();
        System.out.println("systemClasLoader = " + systemClasLoader);
        System.out.println("clasLoaderParent = " + clasLoaderParent);
        System.out.println("parent = " + parent);
    }
}

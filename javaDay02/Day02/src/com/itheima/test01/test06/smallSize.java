package com.itheima.test01.test06;

public class smallSize extends Size {
    String name;
    public smallSize(String kind, String kinds) {
        super(kind, kinds);
    }
    public smallSize(String kind, String kinds, String name) {
        super(kind, kinds);
        this.name = name;
    }
    public void smallSizeshow() {
        System.out.println("鹦鹉类");
        System.out.println("猫头鹰类");
        System.out.println("喜鹊类");
    }
}

package com.itheima.test01.test06;

public class Size extends Animal{
    public String Kinds;

    public Size(String kind) {
        super(kind);
    }

    public Size(String kind, String kinds) {
        super(kind);
        this.Kinds = kinds;
    }
    public void Sizeshow(){
        System.out.println("鸟类");
        System.out.println("哺乳类");
        System.out.println("爬行类");
    }
}

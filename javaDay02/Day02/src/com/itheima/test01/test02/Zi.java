package com.itheima.test01.test02;


import com.itheima.test01.test02.Fu;

public class Zi extends Fu {
    @Override
    public void Same() {
        super.Same();
    }

    public void unSame() {
        System.out.println("子类bu相同");
    }
}

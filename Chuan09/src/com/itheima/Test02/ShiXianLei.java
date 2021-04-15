package com.itheima.Test02;

public class ShiXianLei<VIP> implements JieKou<VIP> {
    @Override
    public void methodAbstract(VIP vip){
        System.out.println(vip);
        System.out.println("Type="+vip.getClass());
    }
}

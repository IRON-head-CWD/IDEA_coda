package com.itheima.Test;



public class ShiXianLei <VIP> implements Jeikou<VIP>{
    @Override
    public void methodAbstract(VIP vip) {
       // System.out.println(VIP vip);
        System.out.println("字节码信息："+vip.getClass());
    }
}

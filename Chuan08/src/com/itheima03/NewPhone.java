package com.itheima03;

public class NewPhone  extends Phone{
    @Override
    public void call(){
        super.call();
        System.out.println("显示姓名");
        System.out.println("显示头像");
        System.out.println("显示归属地");
    }
}

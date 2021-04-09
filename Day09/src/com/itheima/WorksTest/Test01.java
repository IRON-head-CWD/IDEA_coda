package com.itheima.WorksTest;

public class Test01 {
    public static void main(String[] args) {
        //键入号码
      String s="15956423447";
      //截取1-4位
      String s1=s.substring(0,3);
        String s2=s.substring(7);
        String result=s1+"****"+s2;
        System.out.println(result);
    }

}

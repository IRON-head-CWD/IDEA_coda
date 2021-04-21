package com.itheima;

public class Test01 {
    public static void main(String[] args) {
        //int->String空串
        int num=520;
        String str=num+"";//str="num"
        System.out.println(num+""+1314);
        System.out.println("***************");
        //2.String->int 采用包装类
        String sss="1314";
        int number=Integer.parseInt(sss);
        System.out.println(Integer.parseInt(sss)+520);
    }
}

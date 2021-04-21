package com.itheima;

import java.io.UnsupportedEncodingException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="465464";
        byte[] array1=str.getBytes("GBK");
        System.out.println(Arrays.toString(array1));

        String one =new String(array1,"GBK");
        System.out.println(one);

        String two=new String(array1,"UTF-8");
        System.out.println(two);

        String three=new String (array1);
        System.out.println(three);
    }
}

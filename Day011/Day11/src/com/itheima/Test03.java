package com.itheima;

import java.io.File;

public class Test03 {
    public static void main(String[] args) {
        String path="Day05";
        File f=new File(path);
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println("***********");
        System.out.println(f);
        System.out.println(f.toString());
    }
}

package com.itheima02;

import java.io.*;
import java.sql.SQLOutput;

public class Test06 {
    public static void main(String[] args) throws IOException {
        String srcPath="Day11\\dir\\a.txt";
        String dirPath="Day11\\dir\\b.txt";
        long start=System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcPath));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dirPath));
        int temp;
        while((temp=bis.read())!=-1){
            bos.write(temp);
        }
        bis.close();
        bos.close();
        long end=System.currentTimeMillis();
        System.out.println("Buff spend time:"+(end-start));
    }
}

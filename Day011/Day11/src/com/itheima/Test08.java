package com.itheima;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) throws IOException {
        String srcPath="Day11\\dir\\c.txt";
   //创建对象
        FileInputStream fis=new FileInputStream(srcPath);
        //读写数据
        int ch;
        while((ch=fis.read())!=-1){
            System.out.println(fis.read());
        }
        fis.close();
    }
}

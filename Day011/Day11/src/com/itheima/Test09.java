package com.itheima;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test09 {
    public static void main(String[] args) throws IOException {
        String srcPath="Day11\\dir\\c.txt";
        String dirPath="Day11\\dir\\a.txt";
        //创建对象
        FileInputStream fis=new FileInputStream(srcPath);
        FileOutputStream fos=new FileOutputStream(dirPath);
       //读写数据
        int ch;
        while((ch=fis.read())!=-1){
            fos.write(ch);
        }
        //
        fis.close();
        fos.close();
    }
}

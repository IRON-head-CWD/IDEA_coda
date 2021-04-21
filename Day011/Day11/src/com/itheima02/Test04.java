package com.itheima02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        String srcPath="Day11\\dir\\a.txt";
        String desPath="Day11\\dir\\b.txt";
        //build object
        FileInputStream fis=new FileInputStream(srcPath);
        FileOutputStream fos=new FileOutputStream(desPath);
        //read data
        int temp;
        while((temp=fis.read())!=-1){
            fos.write(temp);
        }

        fis.close();
        fos.close();
    }
}

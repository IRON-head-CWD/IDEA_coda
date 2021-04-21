package com.itheima02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //build an Object
        FileOutputStream fos = new FileOutputStream("F:\\Kiley");
        //read and write data
        String str = "danten";
        fos.write(str.getBytes());
        fos.close();
    }
}

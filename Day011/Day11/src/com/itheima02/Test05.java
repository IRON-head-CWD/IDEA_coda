package com.itheima02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) throws IOException {
        String srcPath = "Day11\\dir\\a.txt";
        String dirPath = "Day11\\dir\\b.txt";
        FileInputStream fis = new FileInputStream(srcPath);
        FileOutputStream fos = new FileOutputStream(dirPath);
        byte[] arr = new byte[1024];
        int len;
        while ((len = fis.read(arr)) != -1) {
            fos.write(arr, 0, len);
        }
        fis.close();
        fos.close();
    }
}

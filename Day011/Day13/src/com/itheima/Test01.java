package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        String path="Day13\\dir\\a.txt";
        FileOutputStream fos=new FileOutputStream(path);
        fos.write("hello".getBytes());
    }
}

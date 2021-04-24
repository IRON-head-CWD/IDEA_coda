package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        String path="Day13\\dir\\b.txt";
        FileWriter fw=new FileWriter(path);
        fw.write("world");

    }
}

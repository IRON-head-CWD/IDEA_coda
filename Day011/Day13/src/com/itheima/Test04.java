package com.itheima;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        String scrPath = "Day13\\dir\\a.txt";
        String dirPath = "Day13\\dir\\b.txt";
        //创建对象
        FileReader fr = new FileReader(scrPath);
        FileWriter fw = new FileWriter(dirPath);
        //读写数据
        char[] array = new char[1024];
        int len;
        while ((len = fr.read(array)) != -1) {
            fw.write(array, 0, len);
        }
       //释放资源
        fr.close();
        fw.close();
    }
}



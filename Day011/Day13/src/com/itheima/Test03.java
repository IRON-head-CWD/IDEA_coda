package com.itheima;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) throws IOException {
       String scrPath="Day13\\dir\\a.txt";
       String dirPath="Day13\\dir\\b.txt";
        FileReader fr=new FileReader(scrPath);
        FileWriter fw=new FileWriter(dirPath);
        int ch;
        while((ch=fr.read())!=-1){
            fw.write(ch);
        }fr.close();
        fw.close();
    }
}

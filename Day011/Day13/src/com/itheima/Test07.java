package com.itheima;

import java.io.*;

public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Day\\dir\\a.txt"));
        BufferedReader br=new BufferedReader(new FileReader("Day\\dir\\b.txt"));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}

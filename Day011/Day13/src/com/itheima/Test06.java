package com.itheima;

import java.io.*;

public class Test06 {
    public static void main(String[] args) throws IOException {
        String scrPath="F:\\JAVA\\IDEA_coda\\Day011\\Day13\\dir\\a.txt";
        String dirPath="F:\\JAVA\\IDEA_coda\\Day011\\Day13\\dir\\b.txt";
        //创建对象
        BufferedReader br=new BufferedReader(new FileReader(scrPath));
        BufferedWriter bw=new BufferedWriter(new FileWriter(dirPath));
        //读写数据
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        br.close();
        bw.close();
    }
}

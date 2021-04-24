package com.itheima03;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //定义常量
        String scrPath = "F:\\JAVA\\IDEA_coda\\Day011\\Day13\\dir\\a.txt";
        String dirPath = "F:\\JAVA\\IDEA_coda\\Day011\\Day13\\dir\\b.txt";
        String scrCode = "gbk";
        String dirCode = "utf-8";
        //创建对象
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(scrPath), scrCode));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dirPath), dirCode));
        //读写数据
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        br.close();
        bw.close();
    }
}

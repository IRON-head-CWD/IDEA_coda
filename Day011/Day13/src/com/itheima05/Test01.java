package com.itheima05;

import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //创建对象
        String path = "Day13\\dir\\a.txt";
        boolean append = true;
        FileWriter fw = new FileWriter(path, append);
        //读写数据
        for (int i = 0; i < 11; i++) {
            fw.write("sssssssssssss" + i);
            fw.write("\r\n");
            fw.flush();
        }
        //释放资源
        fw.close();
    }
}

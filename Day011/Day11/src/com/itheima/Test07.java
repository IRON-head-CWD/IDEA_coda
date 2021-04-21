package com.itheima;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) throws IOException {
        String path ="F:\\JAVA\\IDEA_coda\\Day011\\Day11\\dir";
        FileOutputStream fos=new FileOutputStream(path,true);
        for (int i = 0; i < 10; i++) {
            fos.write("java".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}

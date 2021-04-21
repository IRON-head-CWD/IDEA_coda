package com.itheima;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test10 {
    public static void main(String[] args) throws IOException {
        String srcPath="Day11\\dir\\c.txt";
        String dirPath="Day11\\dir\\a.txt";
        //创建对象
        FileInputStream fis=new FileInputStream(srcPath);
        FileOutputStream fos=new FileOutputStream(dirPath);
        //读写数据
        byte[] array=new byte[3];
        //有效长度,数组中真实长度
        int len;
        while((len=fis.read(array))!=-1){
            fos.write(array,0,len);
        }
        //释放资源
        fis.close();
        fos.close();
    }
}

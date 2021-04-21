package com.itheima;

import java.io.*;

public class Test11 {
    public static void main(String[] args) throws IOException {
        //time
       long start=System.currentTimeMillis();
       
        //build object
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Day11\\dir\\c.txt")) ;
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("Day11\\dir\\a.txt"));
        //read and write data
        byte[] array=new byte[1024];
        int len;
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        //relase resource
        bis.close();
        bos.close();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}

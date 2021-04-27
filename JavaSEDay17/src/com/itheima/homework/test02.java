package com.itheima.homework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class test02 {
    public static void main(String[] args) throws IOException {

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //返回字节流
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("F:\\JAVA\\IDEA_coda\\JavaSEDay17\\src\\com\\itheima\\homework\\a.properties");

        Properties prop=new Properties();
        prop.load(resourceAsStream);
        System.out.println(prop);
        resourceAsStream.close();

    }
}

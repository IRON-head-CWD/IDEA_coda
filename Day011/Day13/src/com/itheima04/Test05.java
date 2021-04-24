package com.itheima04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) throws IOException {
        Properties pp=new Properties();
        String path="";
        InputStreamReader isr=new InputStreamReader(new FileInputStream(path));
        //加载数据
        pp.load(isr);
        isr.close();
        //标准的词霸案例
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查找的单词");
        String word=sc.nextLine();
        //查询结果
        String value=pp.getProperty(word);
        value=(value==null)?"强给i啊hsaohdoq":value;
        System.out.println("value = " + value);
    }
}

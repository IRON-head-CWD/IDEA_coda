package com.itheima;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        //创建2个集合
        List<File> fileList = new ArrayList<>();
        List<File> dirList = new ArrayList<>();
        File file = new File("E:\\C51\\ASM");
        //递归遍历文件
        diGui(file, fileList, dirList);
        System.out.println("fileList.size()=" + fileList.size());
        System.out.println("dirList.size()=" + dirList.size());
        System.out.println("--------------------");
        System.out.println("所有的文件夹");
        dirList.forEach(f -> System.out.println(f));
        System.out.println("---------------------");
        fileList.forEach(f -> System.out.println("f = " + f));
    }

    private static void diGui(File file, List<File> fileList, List<File> dirList) {
        //判断当前的是否是文件
        if (file.isFile()) {
            fileList.add(file);
        }
        //判断当前的是否是文件夹
        if (file.isDirectory()) {
            fileList.add(file);
            //获取到子文件的数组，准备去遍历数组，遍历之前判断不为空
            File[] fileArray = file.listFiles();
            if (fileArray != null) {
                for (File child : fileArray) {
                    diGui(child, fileList, dirList);
                }
            }
        }
    }
}

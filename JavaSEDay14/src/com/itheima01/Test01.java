package com.itheima01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //创建2个集合
        List<File> fileList = new ArrayList<>();
        List<File> dirList = new ArrayList<>();
        File file = new File("F:\\JAVA\\IDEA_coda");
        //递归遍历集合
        diGui(file, fileList, dirList);
        //查看结果
        System.out.println("fileList.size()="+fileList.size());
        System.out.println("dirList.size()="+dirList.size());
        System.out.println("-----------------------");
        System.out.println("所有文件夹");
        dirList.forEach(f -> System.out.println(f) );
        System.out.println("------------------------");
        fileList.forEach(file1 -> System.out.println(file1));

    }

    private static void diGui(File file, List<File> fileList, List<File> dirList) {
        //判断当前文件是否是文件
        if (file.isFile()) {
            fileList.add(file);
        }
        //判断当前文件是否是文件夹
        if (file.isDirectory()) {
            dirList.add(file);
            //--------------------
            //获取到子文件的数组，准备去遍历数组，遍历之前需要判断不为空
            File[] fileArray=file.listFiles();
            if (fileArray!=null){
                for(File child:fileArray){
                    diGui(child,fileList,dirList);
                }
            }
        }
        //删除操作

    }
}

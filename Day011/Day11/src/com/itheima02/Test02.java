package com.itheima02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        //build two collection
        List<File> fileList = new ArrayList<>();
        List<File> dirList = new ArrayList<>();
        File file = new File("F:\\Kiley");
        Recursion(file, fileList, dirList);
        System.out.println("delect");

    }

    private static void Recursion(File file, List<File> fileList, List<File> dirList) {
        //judge file
        if (file.isFile()) {
            fileList.add(file);
        }
        if(file.isDirectory()){
            dirList.add(file);
            //get subtext array,ready recorsion
            File[] fileArray=file.listFiles();
            if(fileArray!=null){
                for(File child:fileArray){
                    Recursion(child,fileList,dirList);
                }
            }
        }
    }
}

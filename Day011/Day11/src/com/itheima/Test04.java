package com.itheima;

import java.io.File;
import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<File> dirList=new ArrayList<>();
        ArrayList<File> fileList=new ArrayList<>();
        File f=new File("F:\\learnJAVA");
        diGui(f,dirList,fileList);
        fileList.forEach(file-> System.out.println(file));

    }
    public static void diGui(File f,ArrayList<File> dirList ,ArrayList<File> fileList){
        if (f.isFile()){
            fileList.add(f);
        }
    }
}

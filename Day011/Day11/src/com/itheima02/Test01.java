package com.itheima02;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //build two collections
        List<File> fileList = new ArrayList<>();
        List<File> dirList = new ArrayList<>();
        File file = new File("F:\\Kiley");
        //recursion and traverse file
        Recursion(file, fileList, dirList);
        //look find result
        System.out.println("fileList.size() = " + fileList.size());
        System.out.println("dirList.size() = " + dirList.size());

    }

    private static void Recursion(File file, List<File> fileList, List<File> dirList) {
        //judge file is or not just now;
        if (file.isFile()) {
            fileList.add(file);
        }
        if (file.isDirectory()) {
            dirList.add(file);
        }
        //-------------------------
        //get subtext array,and traverse array
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File child : fileArray) {
                Recursion(child, fileList, dirList);
            }
        }
    }
}

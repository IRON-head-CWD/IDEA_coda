package com.itheima;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test05 {
    public static void main(String[] args) {
        File scrFile=new File("E:\\2020.4.2- 9 时 00分-时照乐-石台县2020年椑坑河小流域水土保持综合治理工程");
        ArrayList<File> dirList=new ArrayList<>();
        ArrayList<File> fileList=new ArrayList<>();
        digui(scrFile,dirList,fileList);
        for(File f:fileList){
            long haoMiao=f.lastModified();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日 HH:MM:SS");
            String time=sdf.format(new Date(haoMiao));
            System.out.println("time+\"--------\"+f.getName() = " + time+"--------"+f.getName());
        }
    }

    private static void digui(File scrFile, ArrayList<File> dirList, ArrayList<File> fileList) {
    }
}

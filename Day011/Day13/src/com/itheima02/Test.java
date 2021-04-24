package com.itheima02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        Student one=new Student("dili",23,"nv");
        Student two=new Student("dili",23,"nv");
        Student three=new Student("dili",23,"nv");

        String path="Day011/Day13";
        ArrayList<Student> array=new ArrayList<>();

        array.add(one);
        array.add(two);
        array.add(three);
        BufferedWriter bw=new BufferedWriter(new FileWriter(path));

        for(Student stu:array){
            StringBuffer sb=new StringBuffer();
            sb.append(stu.getName()).append(",");
            sb.append(stu.getAge()).append(",");
            sb.append(stu.getGender());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();

        }
        bw.close();
    }
}

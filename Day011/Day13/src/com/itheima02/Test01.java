package com.itheima02;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //创建集合的对象
        String path = "Day13\\dir\\a.txt";
        ArrayList<Student> array = new ArrayList<>();
        //读取数据来自于文件
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            String[] strArray = line.split(",");
            //准备存放数据
            Student stu = new Student();
            stu.setName(strArray[0]);
            stu.setAge(Integer.parseInt(strArray[1]));
            stu.setGender(strArray[2]);
            //需要把对象，存放到集合中
            array.add(stu);
        }
        //释放资源
        br.close();
        //遍历集合
        array.forEach(stu -> System.out.println("stu = " + stu));
    }
}

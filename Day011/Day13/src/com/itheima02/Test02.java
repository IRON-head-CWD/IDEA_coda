package com.itheima02;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        read();
       // System.out.println(Object.);
    }

    public static void write() throws IOException {
        //创建对象
        String path = "Day13\\dir\\a.txt";
        Student stu = new Student("张三", 23, "man");
        //读写数据
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        //释放资源
        oos.writeObject(stu);
        oos.close();
    }

    public static void read() throws IOException, ClassNotFoundException {
        //创建对象
        String path = "Day13\\dir\\b.txt";
        //读写数据
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Object o = ois.readObject();

        //释放资源
        ois.close();
        //强制转换
        Student stu = (Student) o;
        System.out.println(stu);

    }
}

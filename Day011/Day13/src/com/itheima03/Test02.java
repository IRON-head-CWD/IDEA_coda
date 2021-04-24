package com.itheima03;



import java.io.*;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();

    }

    private static void write() throws IOException {
        String path="Day13\\dir\\c.txt";
        ArrayList<Student> array=new ArrayList<>();
     //   array.add("nima",28,"man");
    //    array.add("nidei",30,"woman");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(array);
        oos.close();
    }

    private static void read() throws IOException, ClassNotFoundException {
        String path="Day13\\dir\\c.txt";
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(path));
        Object o=ois.readObject();
        //释放资源
   //     o.close();
        //强制转换
        ArrayList<Student>array=(ArrayList<Student>) o;
        //展示结果
        array.forEach(t-> System.out.println(t));
    }
}

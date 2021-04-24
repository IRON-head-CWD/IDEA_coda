package com.itheima;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("userName:");
        String userName=sc.next();
        System.out.println("passWorld");
        String passWorld=sc.next();
        FileWriter fw=new FileWriter("Day13\\dir\\a.txt");
        fw.write(userName);
        fw.write("\r\n");
        fw.write(passWorld);
        fw.flush();
        fw.close();
    }
}

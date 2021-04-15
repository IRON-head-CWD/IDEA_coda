package com.itheima10.test;

import com.itheima10.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> list= new ArrayList<>();
        System.out.println("-----欢迎来到黑马学院-----");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("5.退出");
        System.out.println("请输入您的选择");
        String choice=sc.nextLine();
        switch(choice){
            case "1":
                //添加学生
                addStudent( list);
                break;
            case"2":
                //删除学生
                break;
            case"3":
                //修改学生
                break;
            case"4":
                //查询学生
                break;
        }
    }

    private static void addStudent(ArrayList<Student> list) {
        System.out.println("请输入您要添加的学生学号");
        Scanner sc=new Scanner(System.in);
        String updateSid=sc.next();
        int index=getIndex(list,updateSid);
        if(index==-1){
            System.out.println("查无信息，请重兴输入");
        }else{
            System.out.println("请输入新的学生姓名:");
            String name=sc.next();
        }
    }

   // private static int getIndex(ArrayList<Student> list, String updateSid) {
   // }

}

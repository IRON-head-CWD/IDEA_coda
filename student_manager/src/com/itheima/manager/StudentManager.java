package com.itheima.manager;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //键入
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            //进入网页首先看见的
            System.out.println("---欢迎来到黑马学生信息管理处");
            System.out.println("本系统提供如下功能");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的操作：");
            System.out.println("---------------------------------");
            //获取用户选择
            String choose = sc.nextLine();
            //对用户的录入做出判断
            switch (choose) {
                case "1":
                    System.out.println("进入添加功能");
                    addStudent(list, sc);
                    break;
                case "2":
                    System.out.println("进入删除功能");
                    deleteStudentById(list, sc);
                    break;
                case "3":
                    System.out.println("进入修改功能");
                    updateStudent(list, sc);
                    break;
                case "4":
                    findAllStudent(list);
                    break;
                case "5":
                    System.out.println("退出功能");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误，请重新输入：");
            }
        }
    }

    public static void updateStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("进入修改功能");
        if (list == null || list.size() == 0) {
            System.out.println("暂无数据，请先添加");
            return;
        }
        System.out.println("请输入要修改的学生学号：");
        String id = sc.nextLine();
        int index = findAllStudentById(list, id);
        if (index == -1) {
            System.out.println("查无此人，请查证后重新选择输入");
        } else {
            System.out.println("请输入学生名字");
            String name = sc.nextLine();
            System.out.println("请输入学生年龄");
            String age = sc.nextLine();
            System.out.println("请输入学生生日");
            String birthday = sc.nextLine();
            //封装到一个学生对象中
            Student s = new Student(id, name, age, birthday);
            list.set(index, s);
            System.out.println("修改成功");
        }
    }

    //学号的唯一性校验
    private static int findAllStudentById(ArrayList<Student> list, String id) {
        if (list == null || list.size() == 0) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    private static void findAllStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("暂无信息，请先添加！");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    public static void addStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入添加信息功能");
        String id;
        while (true) {
            System.out.println("请输入学生学号");
            id = sc.nextLine();
            int index = findAllStudentById(list, id);
            if (index == -1) {
                break;
            } else {
                System.out.println("学号已经存在，重新录入");
            }
        }
        System.out.println("请输入学生名字");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生生日");
        String birthday = sc.nextLine();
        //封装到一个学生对象中
        Student s = new Student(id, name, age, birthday);
        //
        list.add(s);
        System.out.println("添加信息成功");
    }

    public static void deleteStudentById(ArrayList<Student> list, Scanner sc) {
        System.out.println("进入删除功能");
        if (list == null || list.size() == 0) {
            System.out.println("暂无数据，请先添加");
            return;
        }
        System.out.println("请输入要删除的学生学号：");
        String id = sc.nextLine();
        int index = findAllStudentById(list, id);
        if (index == -1) {
            System.out.println("查无此人，请查证后重新选择输入");
        } else {
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

}

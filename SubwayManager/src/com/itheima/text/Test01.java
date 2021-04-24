package com.itheima.text;


import com.itheima.domain.Manager;
import com.itheima.domain.Subway;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Test01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //创建集合容器、添加Manager和Subway集合

        ArrayList<Manager> list = new ArrayList<>();
        lo:
        while (true) {
            //主界面
            System.out.println("--------欢迎来到北京地铁管理系统--------");
            System.out.println("4 管理员登录");
            //登录需要账户和密码
            System.out.println("1 查看地铁");
            System.out.println("2 添加地铁");
            System.out.println("3 退出");
            System.out.println("请输入您的选择:");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //查看地铁
               //     querySubway();
                    break;
                case "2":
                    //添加地铁
               //     addSubway();
                    break;
                case "3":
                    System.out.println("感谢您的使用");
                    break ;
                case "4":
                    //用户登录方法
                 //   passsWordAndUserName();
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }

/*
    //用户登录方法
    private static int passsWord(ArrayList<Manager> list, String ID) {
        System.out.println("请输入用户名：");
        Scanner sc01=new Scanner(System.in);
        String userName=sc01.next();
        // 1. 假设传入的ID, 在集合中不存在
        int index = -1;
        // 2. 遍历集合, 获取每一个员工对象, 准备进行查找
        for (int i = 0; i < list.size(); i++) {
            Manager stu = list.get(i);
            // 3. 获取每一个员工对象的ID
            String id = stu.getID();
            // 4. 使用获取出的员工学号, 和传入的ID(查找的ID)进行比对
            if (id.equals(ID)) {
                // 存在: 让index变量记录正确的索引位置
                index = i;
            }
        }
        return index;
    }

 */

      /*  System.out.println("请输入用户名：");
        Scanner sc01=new Scanner(System.in);
        String userName=sc01.next();
        System.out.println("请输入密码：");
        Scanner sc02=new Scanner(System.in);
        String passWorld=sc02.next();

       */


    //问题一
    private static void method01() throws IOException {
        String path = "F:\\JAVA\\IDEA_coda\\SubwayManager/src/dir/Manager.txt";
        //创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        ////读取数据到集中
        ArrayList<Manager> list1 = new ArrayList<>();
        Manager manager1 = new Manager("10001", "小王", "男", "13112345678");
        Manager manager2 = new Manager("10002", "老于", "男", "13212345678");
        Manager manager3 = new Manager("10003", "老方", "男", "13312345678");

        list1.add(manager1);
        list1.add(manager2);
        list1.add(manager3);
        oos.writeObject(list1);
        //释放资源
        oos.close();
    }

    private static void method02() throws IOException {
        String path = "F:\\JAVA\\IDEA_coda\\SubwayManager/src/dir/Subway.txt";
        //创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        ////读取数据到集中
        ArrayList<Subway> list2 = new ArrayList<>();
        Subway subway01 = new Subway("s3002", "南锣鼓湾", "6号线");
        Subway subway02 = new Subway("s5016", "王府井", "1号线");
        Subway subway03 = new Subway("s2026", "西直门", "4号线");

        list2.add(subway01);
        list2.add(subway02);
        list2.add(subway03);
        oos.writeObject(list2);
        //释放资源
        oos.close();
    }
}

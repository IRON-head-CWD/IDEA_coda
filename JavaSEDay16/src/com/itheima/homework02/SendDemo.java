package com.itheima.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入");
        String s = sc.next();
        while (true) {

            if (s.equals("886")) {
                break;
            }
            //创建数据包，并打包
            byte[] bytes = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.13.55"), 10086);
            //调用DatagramSocket对象的方法发送数据
            ds.send(dp);
        }
        //关闭发送端
        ds.close();
    }
}

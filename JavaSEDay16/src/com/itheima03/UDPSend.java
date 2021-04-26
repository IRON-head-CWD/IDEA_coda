package com.itheima03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建发送端socket对象
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        InetAddress address = InetAddress.getByName("224.0.1.0");
        // InetAddress address = InetAddress.getByName("192.168.13.68");
        //打包
        /*
        DatagramPacket(bate[] buf,int length,InetAddress address,int port)
                       数据         数据长度      发送地址            发送端口号
         */
        while (true) {
            String line = sc.nextLine();
            if (line.equals("886")) {
                break;
            }
            byte[] buf = line.getBytes();

            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 6666);
            //发送资源
            socket.send(packet);
        }
        //释放资源
        socket.close();

    }
}

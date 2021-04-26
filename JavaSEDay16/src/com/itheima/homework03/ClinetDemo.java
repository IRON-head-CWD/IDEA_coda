package com.itheima.homework03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClinetDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的socket对象
        DatagramSocket ds=new DatagramSocket();
        String s="HelloWorld";
        byte[] bytes=s.getBytes();
        InetAddress address=InetAddress.getByName("192.168.13.55");
        int port=10000;
        //创建数据，并把数据打包（DatagraPacket）
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
        ds.send(dp);
        ds.close();
    }
}

package com.itheima.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的socket对象
        DatagramSocket ds = new DatagramSocket(10086);
        while (true) {
            //创建一个数据包
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            //接收数据
            ds.receive(dp);
            //解析数据包
            System.out.println("数据是" + new String(dp.getData(), 0, dp.getLength()));
        }
    }
}

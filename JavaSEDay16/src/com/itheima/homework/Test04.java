package com.itheima.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //创建接收端的socket对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket(10086);
        //接受数据以1024为单位发送
        byte[] bytes=new byte[1024];
        //数据包发送
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //调用DatagramSocket对象的方法接受数据
        ds.receive(dp);

        //解析数据包，并把数据在控制台显示
        System.out.println("数据是"+new String(dp.getData(),0,dp.getLength()));
    }
}

package com.itheima.homework04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//接收端
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建接受端的socket对象
        DatagramSocket ds=new DatagramSocket();
        //创建一个数据包，用于接收数据
        DatagramPacket dp=new DatagramPacket(new byte[1024],1024);
        //调用DatagramPacket对象的方法接收数据
        ds.receive(dp);
        //解析数据包，并把数据在控制台显示
        byte[] data=dp.getData();
        int length=dp.getLength();
        System.out.println(new String(data,0,length));
        //关闭jieshouduan   
        ds.close();

    }
}

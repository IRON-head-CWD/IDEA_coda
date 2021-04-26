package com.itheima.homework;

import java.io.IOException;
import java.net.*;

import static java.net.InetAddress.getByName;

public class Test03 {

    public static void main(String[] args) throws IOException {
        //创建发送端对象,并设置端口ds
        DatagramSocket ds = new DatagramSocket();
        //将传输String转为字符
        byte[] bys = "hello,upp".getBytes();
        //创建一个DatagramPacket用于接收长度为len的数据包
        DatagramPacket dp = new DatagramPacket(bys, bys.length, bys.length, getByName("192.168.13.55"), 10086);
        ds.send(dp);
        ds.close();

    }
}

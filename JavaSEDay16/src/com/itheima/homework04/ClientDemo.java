package com.itheima.homework04;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        //创建发送端socket对象
        DatagramSocket ds=new DatagramSocket();

        //创建存储数据的箱子，将广播地址封装进去
        String s="广播 99999";
        byte[] bytes=s.getBytes();//转换为字节

        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("255.255.255.255"),10000);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }
}

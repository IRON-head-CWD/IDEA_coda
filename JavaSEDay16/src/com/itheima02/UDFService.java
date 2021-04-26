package com.itheima02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDFService {
    public static void main(String[] args) throws IOException {
        //创建接收对象
        DatagramSocket socket=new DatagramSocket(8888);
        //打包接受
        byte[] bytes=new byte[1024];
        //用byte数据去接收
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
        //接收
        socket.receive(packet);
        //解析包裹，得到数据
        //解析其中有效熟局
        int len=packet.getLength();
        String s=new String(bytes,0,len);
        System.out.println(s);
        socket.close();

    }
}

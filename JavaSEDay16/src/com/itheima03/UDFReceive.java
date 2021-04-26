package com.itheima03;

import java.io.IOException;
import java.net.DatagramPacket;

import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class UDFReceive {
    public static void main(String[] args) throws IOException {
        //创建接收对象
        MulticastSocket socket=new MulticastSocket();
       socket.joinGroup(InetAddress.getByName("224.0.1.0"));
        //打包接受
        while (true) {
            byte[] bytes=new byte[1024];
            //用byte数据去接收
            DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
            //接收
            socket.receive(packet);
            InetAddress address=packet.getAddress();
            //解析包裹，得到数据
            //解析其中有效熟局
            int len=packet.getLength();
            String s=new String(bytes,0,len);
            System.out.println(address.getHostAddress()+"shuo"+s);
        }
        //socket.close();

    }
}

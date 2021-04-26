package com.itheima02;

import java.io.IOException;
import java.net.*;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //创建发送端socket对象
        DatagramSocket socket = new DatagramSocket();
        //打包
        /*
        DatagramPacket(bate[] buf,int length,InetAddress address,int port)
                       数据         数据长度      发送地址            发送端口号
         */
        byte[] buf = "杀四郎，强碉楼；枪在手，跟我走".getBytes();
        InetAddress address = InetAddress.getByName("192.168.13.68");
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 6666);
        //发送资源
        socket.send(packet);
        //释放资源
        socket.close();

    }
}

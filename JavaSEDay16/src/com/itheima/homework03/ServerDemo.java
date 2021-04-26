package com.itheima.homework03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端socket对象
        MulticastSocket ms=new MulticastSocket(10086);
        //创建一个箱子，用于接受数据
        DatagramPacket dp=new DatagramPacket(new byte[1024],1024);
        //把当前计算机绑定一个组播地址，表示添加到这一组
        ms.joinGroup(InetAddress.getByName("224.0.1.0"));
        //将数据接收到箱子中
        ms.receive(dp);
        //解析数据包，并输出数据
        byte[] data=dp.getData();
        int length=dp.getLength();
        System.out.println(new String(data,0,length));
        //释放资源
        ms.close();
    }
}

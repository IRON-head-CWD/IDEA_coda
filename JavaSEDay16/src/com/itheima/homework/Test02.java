package com.itheima.homework;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test02 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("192.168.13.55");
        String name=address.getHostName();
        String ip=address.getHostAddress();
        System.out.println(name+"**************"+ip);
    }
}

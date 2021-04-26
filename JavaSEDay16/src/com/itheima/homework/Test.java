package com.itheima.homework;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("192.168.13.31");
        String hostAddress=address.getHostAddress();
        String hostName=address.getHostName();
        System.out.println("hostAddress = " + hostAddress);
        System.out.println("hostName = " + hostName);
    }
}

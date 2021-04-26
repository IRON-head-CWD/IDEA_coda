package com.itheima05;

import java.io.*;
import java.net.Socket;

public class TCPClientDemo {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket("192.168.3.55",10086);
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer.write("你好服务器。枪在手跟我走");
        writer.newLine();
        writer.flush();
        socket.shutdownOutput();
        String line= reader.readLine();
        System.out.println(line);
    }
}

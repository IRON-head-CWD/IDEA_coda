package com.itheima.Demo004;

public class Teacher {
    int jopNum;
    String name;
    public Teacher(){
        System.out.println("无参构造");
    }
    public Teacher(String name,int jopNum){
        System.out.println("有参构造"+jopNum+name);
    }
}

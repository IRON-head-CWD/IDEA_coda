package com.itheima05;

public class ZiLei extends FuLei {
    String gender;
    //public ZiLei {
    //    super();
   // }
    public ZiLei(String name,int age,String gender){
        super(name,age);
        this.gender=gender;
    }
    @Override
    public void eat(){
        System.out.println("儿子吃饭饭");
    }
    public void show(){
        System.out.println(name+","+age+","+gender);
    }
}

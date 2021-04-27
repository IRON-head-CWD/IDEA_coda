package com.itheima.homework02;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //class类中的静态方法forName
        Class clazz1 = Class.forName("com.itheima.homework02.Student");
        System.out.println("clazz1 = " + clazz1);

        //通过属性获得
        Class clazz2=Student.class;
        System.out.println("clazz2 = " + clazz2);

        //3.利用对象的getClass方法来获取class对象
        //getClass方法是定义在Object类中.
        Student s=new Student();
        Class clazz3=s.getClass();
        System.out.println("clazz3 = " + clazz3);

        System.out.println(clazz1==clazz2);
        System.out.println(clazz1==clazz3);
    }
}

package com.itheima.homework03;

import com.itheima.homework02.Student;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //class类中的静态方法forName
        //method01


        //通过属性获得
        Class clazz2 = com.itheima.homework02.Student.class;
        System.out.println("clazz2 = " + clazz2);

        //3.利用对象的getClass方法来获取class对象
        //getClass方法是定义在Object类中.
        com.itheima.homework02.Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println("clazz3 = " + clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
    }

    public static void method01() throws ClassNotFoundException {
        Class clazz1 = Class.forName("com.itheima.homework03.Student");
        Constructor<?>[] constructors = clazz1.getDeclaredConstructors(String.class);
        System.out.println("constructor" + constructors);
    }

    public static void method02() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz2 = Class.forName  ("com.itheima.homework03.Student");
        Constructor[] constructors=clazz2.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        public static void method03() throws ClassNotFoundException {
            Class clazz3 = Class.forName("com.itheima.homework03.Student");

            Constructor constructors = clazz3.getDeclaredConstructors();
            System.out.println("constructor" + constructors);
            clazz3.getConstructor(String.class,int.class)
        }
    }
}

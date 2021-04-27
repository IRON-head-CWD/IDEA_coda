package com.itheima.homework03;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //class类中的静态方法forName
        //method01

    }

    public static void method01() throws ClassNotFoundException {
        Class clazz1 = Class.forName("com.itheima.homework03.Student");
        Constructor<?>[] constructors = clazz1.getDeclaredConstructors();
        System.out.println("constructor" + constructors);
    }

    public static void method02() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz2 = Class.forName("com.itheima.homework03.Student");
        Constructor[] constructors = clazz2.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }
    }
        public static void method03() throws ClassNotFoundException,NoSuchMethodException{
            Class clazz = Class.forName("com.itheima.homework03.Student");
            Constructor constructor = clazz.getConstructor();
            System.out.println("constructor = " + constructor);

            Constructor<?>[] constructors1 = clazz.getConstructors(String.class,int.class);
            System.out.println("constructors1 = " + constructors1);

            Constructor constructor2 = clazz.getConstructor(int.class);
            System.out.println("constructor2 = " + constructor2);
        }




}

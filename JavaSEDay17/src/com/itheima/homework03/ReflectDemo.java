package com.itheima.homework03;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //class类中的静态方法forName
        //method01

    }

    private static void method01() throws ClassNotFoundException {
        Class clazz1 = Class.forName("com.itheima.homework03.Student");
        Constructor<?>[] constructors = clazz1.getDeclaredConstructors();
        System.out.println("constructor" + constructors);
    }

    private static void method02() throws ClassNotFoundException, NoSuchMethodException {
        Class clazz2 = Class.forName("com.itheima.homework03.Student");
        Constructor[] constructors = clazz2.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }
    }

    private static void method3() throws ClassNotFoundException, NoSuchMethodException {
        //        Constructor<T> getConstructor(Class<?>... parameterTypes)：
//                                      返回单个公共构造方法对象
        //1.获取Class对象
        Class clazz = Class.forName("com.itheima.myreflect3.Student");
        //小括号中,一定要跟构造方法的形参保持一致.
        Constructor constructor1 = clazz.getConstructor();
        System.out.println(constructor1);

        Constructor constructor2 = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor2);

        //因为Student类中,没有只有一个int的构造,所以这里会报错.
        Constructor constructor3 = clazz.getConstructor(int.class);
        System.out.println(constructor3);
    }

    private static void method4() throws ClassNotFoundException, NoSuchMethodException {
        //        Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：
//                                      返回单个构造方法对象
        //1.获取Class对象
        Class clazz = Class.forName("com.itheima.homework03.Student");
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor);
    }


}

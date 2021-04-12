package com.itheima;

public class homeTest04 {
    /*
   请按以下步骤要求编写代码：
定义一个“年龄异常类”：AgeException，使其继承自 RuntimeException，并添加无参、String 参数的构造方法；
定义一个“性别异常类”：SexException，使其继承自 RuntimeException，并添加无参、String 参数的构造方法；
定义一个 Student 类，属性：姓名、性别、年龄。
在性别的 set 方法中判断是否是男/女，如果不是则抛出：性别异常
在年龄的 set 方法中判断年龄是否是 15--50 之间，如果不是则抛出：年龄异常编写测试类，创建一个 Student 对象，
并在 try{}中调用 setXxx()方法为对象属性赋值，在 catch() 中打
    */
    public static void main(String[] args) {
        String name = "张三";
        String gender = "man";
        int age = 18;
        try {
            Pare(gender, age);
        } catch (SexException e) {
            e.printStackTrace();
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    public static void Pare(String gender, int age) throws SexException, AgeException {
        System.out.println("未完");
        Student stu1=new Student();
        stu1.setGender(gender);
        Student stu2=new Student();
        stu2.setAge(age);
        System.out.println(stu1.getGender()+"\t"+stu2.getAge());

    }
}

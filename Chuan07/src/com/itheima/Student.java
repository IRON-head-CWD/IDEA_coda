package com.itheima;

public class Student {
    /*
    定义一个 Student 类，属性：姓名、性别、年龄
     */
    String name;
    String gender;
    int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        /*
 set 方法中判断是否是男/女，如果不是则抛出性别异常：
         */
        this.gender = gender;
        if(!(gender.equals("man")||gender.equals("woman"))){
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        /*
在年龄的 set 方法中判断年龄是否是 15--50 之间，如果不是则抛出：
         */
        this.age = age;
        if (age <= 50 && age >= 15) {
            System.out.println("劳动力");
        } else {
            throw new NullPointerException();
        }
    }
}
package com.itheima;

public class Student01 {
    private String name;
    private int  age;

    public Student01() {
    }

    public Student01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student01 student01 = (Student01) o;

        if (age != student01.age) return false;
        return name != null ? name.equals(student01.name) : student01.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}

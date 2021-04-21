package com.itheima;

public class Test02 {
    public static void main(String[] args) {
        Student01 stu01=new Student01("迪丽热巴",19);
        System.out.println("stu01 = " + stu01);
        System.out.println("stu01.toString() = " + stu01.toString());
        System.out.println("-------------------");
        Student01 stu02=new Student01("古力娜扎",20);
        Student01 stu03=new Student01("古力娜扎",20);
        Student01 stu04=new Student01("马儿扎哈",99);
        //compare two object if there are equal
        System.out.println("stu02==stu03 = " + (stu02 == stu03));
        System.out.println("stu02==stu04 = " + (stu02 == stu04));
        //basic data type compare value;quote data type compare address of value.
        System.out.println("stu02.equals(stu03) = " + stu02.equals(stu03));
        System.out.println("stu02.equals(stu04) = " + stu02.equals(stu04));
    }
}

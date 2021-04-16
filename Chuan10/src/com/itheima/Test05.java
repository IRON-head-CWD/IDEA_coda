package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        HashMap<Student,String> hm=new HashMap<>();
        Student s1=new Student("xiao",23);
        Student s2=new Student("xiao",24);
        Student s3=new Student("xiao",28);
        Student s4=new Student("xiao",230);
        Student s5=new Student("xiao",234);
        hm.put(s1,"jiangsu");
        hm.put(s2,"jiangsu");
        hm.put(s3,"jiangsu");
        hm.put(s4,"jiangsu");
        hm.put(s5,"jiangsu");
        Set<Student> keys=hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key+"************"+value);
        }
        System.out.println("*************");
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"********"+value);
        }
        System.out.println("****************");
        hm.forEach(
                (Student key,String value)->{
            System.out.println(key + "********" + value);
        }
        );
    }
}

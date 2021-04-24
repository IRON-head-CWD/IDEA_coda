package com.itheima04;

import java.util.Properties;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        //创建对象
        Properties prop=new Properties();
        //添加数据
        prop.setProperty("小龙女","一直平");
        prop.setProperty("shipo","一ff");
        prop.setProperty("sas","一h平");
        prop.setProperty("小sas","一jftuy平");
        System.out.println("prop = " + prop);

       //获取数据
        String value1=prop.getProperty("龙女");
        System.out.println("value1 = " + value1);

        String value2=prop.getProperty("小龙女");
        System.out.println("value2 = " + value2);
        System.out.println("***************");
        //遍历
        Set<String> strings=prop.stringPropertyNames();
        for (String key : strings) {
            String value=prop.getProperty(key);
            System.out.println("value = " + value);
        }
    }
}

package com.itheima02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test08 {
    //需求: 把马开头的人 干掉！ 删除以马开头的
    public static void main(String[] args) {
        //创建集合对象,并且添加数据
        Collection<String> c = new ArrayList<>();
        c.add("马云");
        c.add("马化腾");
        c.add("王健林");
        c.add("李彦宏");
        c.add("累不死 雷军");
        c.add("刘强东");
        //获取到迭代器
        Iterator<String> iter = c.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.startsWith("马")) {
                //c.remove(str);
                iter.remove();
            }
        }
        System.out.println("嘻嘻,你看不到我");
        //在后续打印输出
        System.out.println("c = " + c);
    }
}




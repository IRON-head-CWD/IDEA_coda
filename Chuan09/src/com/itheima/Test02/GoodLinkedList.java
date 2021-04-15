package com.itheima.Test02;

import java.util.LinkedList;

public class GoodLinkedList extends LinkedList {
    public Object updateFirst(Object newData) {
        //获取头
        Object oldDate=super.getClass();
        //删除头
        super.removeFirst();
        //添加头
        super.addFirst(newData);
        //返回头，被修改的元素
        return oldDate;
    }
    public Object updateLast(Object newLast){
        //获取尾
        Object oldLast=super.getLast();
        //删除尾
        super.removeLast();
        //添加尾
        super.addLast(newLast);
        //返回旧的尾，被修改的元素
        return oldLast;
    }
}

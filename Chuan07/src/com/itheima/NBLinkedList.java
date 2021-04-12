package com.itheima;

import java.util.LinkedList;

public class NBLinkedList extends LinkedList {
    public Object updateFirst(Object newHead) {
        Object oldHead = super.getFirst();
        super.removeFirst();
        super.addFirst(newHead);
        return oldHead;
    }
    public Object updateLast(Object newWei) {
        Object oldWei = super.getLast();
        super.removeLast();
        super.addLast(newWei);
        return oldWei;
    }
}


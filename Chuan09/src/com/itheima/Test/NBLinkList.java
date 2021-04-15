package com.itheima.Test;

import java.util.LinkedList;

public class NBLinkList <GOOD> extends LinkedList<GOOD> {
    public GOOD updateFirst(GOOD newTou){
        GOOD oldTou=super.getFirst();
        super.removeFirst();
        super.addFirst(newTou);
        return oldTou;
    }
    public GOOD updateLast(GOOD newWei){
        GOOD oldWei=super.getLast();
        super.removeLast();
        super.addFirst(newWei);
        return oldWei;
    }
}

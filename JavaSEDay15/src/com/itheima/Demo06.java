package com.itheima;

import java.util.concurrent.ConcurrentHashMap;

public class Demo06 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        new Thread(() -> {
            for (int i = 0; i < 25; i++) {
                map.put(i, i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 26; i < 50; i++) {
                map.put(i, i);
            }
        }).start();
        Thread.sleep(1000);
        map.forEach((k, v) -> {
            System.out.println("k = " + k + "========" + "v=" + v);
        });
    }
}

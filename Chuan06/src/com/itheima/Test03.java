package com.itheima;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test03 {
    public static void main(String[] args) {
        String birthday = "2018年04月01日12：12：12";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH:MM:SS");
        LocalDateTime ldt = LocalDateTime.parse(birthday, formatter);
        System.out.println(ldt);
    }
}

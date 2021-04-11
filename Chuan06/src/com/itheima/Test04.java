package com.itheima;


import java.time.LocalDate;

public class Test04 {
    public static void main(String[] args) {
        int year=2019;
        LocalDate ld= LocalDate.of(year,2,28);
        LocalDate newLd=ld.plusDays(1);
        int dayofMonth=newLd.getDayOfMonth();
        System.out.println("dayofMonth="+dayofMonth);
        System.out.println(dayofMonth==29?"闰年":"平年");
    }
}

package com.itheima;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test02 {
    public static void main(String[] args) {
        LocalDateTime ldt= LocalDateTime.of(2014,4,1,10,11,12);
        LocalDate id=ldt.toLocalDate();
        int dayofYear= ldt.getDayOfYear();
        System.out.println(dayofYear);
        DayOfWeek week= ldt.getDayOfWeek();
        System.out.println(week);

    }
}

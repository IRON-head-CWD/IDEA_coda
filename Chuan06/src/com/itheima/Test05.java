package com.itheima;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test05 {
    public static void main(String[] args) {
        String birthDay="2008";
        String tothDay="2008";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy年MM月DD日");
       // LocalDate birthdayLocalDate=LocalDate.parse(birthday,formatter);
      //  LocalDate tothdayLocalDate=LocalDate.parse(tothday,formatter);
      //  Period between= Period.between(birthdayLocalDate,tothdayLocalDate);
      //  long total=between.toTotalMonths();
        //System.out.println("total="+total);

    }
}

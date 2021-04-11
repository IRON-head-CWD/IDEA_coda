package com.itheima;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Test11 {
  /*
  1. 题目一
请编写程序，使用 Calendar 类获取日历对象，
并分别获取年、月、日、小时、分、秒, 并将它们打印到控制台。
说明：这里由于 Calender没有学习，建议使用 LocalDateTime 类去完成。
   */
  public static void main(String[] args) {
      // (1). 获取到对象
      LocalDateTime ldc = LocalDateTime.now();
      System.out.println("ldc = " + ldc);

// (2). 获取指定的时间. 单独的某个时间点 getXxx
      int year = ldc.getYear();
      System.out.println("year = " + year);
      int monthValue = ldc.getMonthValue();
      System.out.println("monthValue = " + monthValue);
      int dayOfMonth = ldc.getDayOfMonth();
      System.out.println("dayOfMonth = " + dayOfMonth);
      DayOfWeek dayOfWeek = ldc.getDayOfWeek();
      System.out.println("dayOfWeek = " + dayOfWeek);
      int hour = ldc.getHour();
      System.out.println("hour = " + hour);
  }
}

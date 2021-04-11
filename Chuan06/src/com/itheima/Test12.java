package com.itheima;

import java.util.Scanner;

public class Test12 {
    /*
      2. 题目二
请编程，计算并打印“1949 年 10 月 1 日”那天是星期几？
       */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full year:");
        int year = input.nextInt();
        System.out.println("Enter month as a number between 1 and 12:");
        int month = input.nextInt();
        printMonth(year, month);

    }

    private static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }



    private static void printMonthTitle(int year, int month) {
        System.out.println("\t" + getMonthName(month) + "\t" + year);
        System.out.println("-----------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "Noveber";
                break;
            case 12:
                monthName = "December";
        }
        return monthName;
    }
    private static void printMonthBody(int year, int month) {
        int startDay=getStartDay(year,month);
        int numberofDayInMonth=getNumberOfDaysInMonth(year,month);
        int i=0;
        for (; i <startDay ; i++) {
            System.out.println("\t");
            if((i+startDay)%7==0)
                System.out.println();
        }
        System.out.println();
    }
    public static int getStartDay(int year,int month){
        final int START_DAY_FOR_JAN_1_1800=3;
        int totalNumberOfDays=getTotalNumberOfDays(year,month);
        return (START_DAY_FOR_JAN_1_1800+totalNumberOfDays)%7;
    }

    private static int getTotalNumberOfDays(int year, int month) {
        int total=0;
        for(int i=1800;i<year;i++)
            if(isLeapYear(i))
                total=total+366;
            else
                total=total+365;
            for(int i=1;i<month;i++)
                total=total+getNumberOfDaysInMonth(year,i);
        return total;
    }

    private static int getNumberOfDaysInMonth(int year, int month) {
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            return 31;
        if (month==2||month==4||month==6||month==9||month==11)
            return 30;
        if(month==2)return isLeapYear(year)?29:28;
        return 0;
    }

    private static boolean isLeapYear(int year) {
        return year %400==0||(year%4==0&&year%100!=0);
    }
}

package com.itheima03;

public class nowTime {
    public static void main(String[] args) {
        //Obtain the total milliseconds since midnight,jan 1,1970
        long totalMillsecond = System.currentTimeMillis();
        //obtain the total seconds since midnight ,jan1,1970
        long totalSecond = totalMillsecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println(currentHour + "\t" + currentSecond + "\t" + currentMinute);
    }
}

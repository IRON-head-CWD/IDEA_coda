package com.itheima;

public class year {
    public static void main(String[] args) {
        getTotalNumberOfDays( 2000, 12);
    }
    public  static int getTotalNumberOfDays(int year, int month){
        int total=0;
        for(int i=1800;i<year;i++)
            if(isLeapYear(i))
                total=total+366;
            else
                total=total+365;
        for (int i = 0; i <month ; i++) {
         total=total+ getTotalNumberOfDaysInmonth(year,i);

        } return total;
    }
    private static int getTotalNumberOfDaysInmonth(int year, int month) {
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            return 31;
            if(month==11||month==4||month==4||month==9)
                return 30;
            if(month ==2);
            return isLeapYear(year)?29:28;
    }
    private static boolean isLeapYear(int year) {
        return year %400==0||(year %4==0&&year%100!=0);
    }
}

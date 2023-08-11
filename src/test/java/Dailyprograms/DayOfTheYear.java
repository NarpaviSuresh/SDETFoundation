package Dailyprograms;


import org.junit.Test;

import static java.lang.Integer.parseInt;


public class DayOfTheYear {
/*
    PROBLEM STATEMENT
    Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD,
    return the day number of the year.
*/

    /* Input
       String date in YYYY-MM-DD format

     Output
     Int

     Test data: date = "2019-01-09"

     */
   @Test
   public void test1(){
       int i = dayOfYear("2019-01-09");
       System.out.println(i);
   }

    public int dayOfYear(String date){
    String [] parts = date.split("-");
    int year = parseInt(parts[0]);
    int month = parseInt(parts[1]);
    int day = parseInt(parts[2]);

    int[] daysInMonth ={31,28,31,30,31,30,31,31,30,31,30,31};
    int dayOfYear = 0;

    for (int i=0; i<month-1;i++){
        dayOfYear = daysInMonth[i];
    }
    dayOfYear +=day;
        /*A year is a leap year:
        if it is divisible by 400
        it is divisible by 4 but not divisible by 100.*/

    if(month>2 && year%4==0 && (year%100!=0 && year%400==0 )){
        dayOfYear +=1;
        }
        return dayOfYear;
    }
}

package Dailyprograms;

import org.junit.Test;

public class DayOfWeek {
  /*  Given a date, return the corresponding day of the week for that date.
    The input is given as three integers representing the day, month and year respectively.
    Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
Input: day = 31, month = 8, year = 2019
Output: "Saturday"

*/@Test
  public void test1(){
    String s = dayOfTheWeek(19, 7, 1989);
    System.out.println(s);
  }
  @Test
  public void test2(){
    String s = dayOfTheWeek(18, 7, 1999);
    System.out.println(s);
  }
  public String dayOfTheWeek(int day, int month, int year) {

    //    saving the days in string array
    String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    //day of the month
    int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    int num=0;
    for (int i = 1971; i < year; i++) {
      if(i%4==0){
        num+=366;
      }
      else {
        num+=365;
      }
    }
    if(year%4==0){
      daysOfMonth[1]=29;
    }
    for (int i = 0; i < month-1 ; i++) {
      num+=daysOfMonth[i];
    }
    num+=day-1;
      return week[(num + 5) % 7];
  }


}

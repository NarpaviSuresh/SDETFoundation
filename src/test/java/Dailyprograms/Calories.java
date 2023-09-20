package Dailyprograms;


import junit.framework.Assert;
import org.junit.Test;

public class Calories {
    @Test
    public void test1(){
        int output = calCalories(new int[]{1, 2, 3, 4, 5}, 1, 3, 3);
        Assert.assertEquals(0,output);
    }
    @Test
    public void test2(){
        int output = calCalories(new int[]{2,0,4,3,7}, 1, 3, 4);
        Assert.assertEquals(0,output);
    }

    @Test
    public void test3(){
        int output = calCalories(new int[]{3,2}, 2, 0, 1);
        Assert.assertEquals(1,output);
    }
    public int calCalories(int[] calorie,int day,int lower,int upper){
        int counter=0;
        for (int i = 0; i < (calorie.length)-day ; i++) {
            for (int j = 1; j <day; j++) {
                if((i<lower)&&(i<upper)) counter--;
               else if((i>lower)&&(i>upper)) counter++;
            }
        }

        return counter;
    }
}

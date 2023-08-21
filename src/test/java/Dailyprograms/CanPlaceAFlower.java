package Dailyprograms;

import org.junit.Test;

public class CanPlaceAFlower {
    /*
    11 STEP APPROACH FOR PROBLEM SOLVING
========================================
1.Understanding the problem to detialed level(input and output, constrain) - Yes
input - int array and int  out put boolean
2.Frame Test data (valid, invalid and edge cases) - Yes
    int[] flowerbed = [1,0,0,0,1], n = 1
    int[] flowerbed = [1,0,1,0,1], n = 2
    int[] flowerbed = [1,1,1,0,1], n = 2

3.Do you know the solution or else ask for hint? -ask for the int
4.Do you have any alternate approaches? find the best appraoch? no
5.Write Pseudo code in paper  - Yes
6.Dry run the pseudo code with prepared Test Data  - Yes
7.Write the code on paper - Yes
8.Check for complie time errors - Yes
9.write code on IDE - Yes
10.Debug the code if any failures - Yes
11.Optimise the code
     */
    @Test
    public void test1(){
        boolean b = canPlaceflower(new int[]{1, 0, 0, 0, 1}, 1);
        System.out.println(b);
    }
    @Test
    public void test2(){
        boolean b = canPlaceflower(new int[]{1, 0, 0, 0, 1}, 2);
        System.out.println(b);
    }
    @Test
    public void test3(){
        boolean b = canPlaceflower(new int[]{1, 1, 0, 0, 0}, 2);
        System.out.println(b);
    }
    public boolean canPlaceflower(int[] flowerbed, int n) {
        int count = 0, i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i==flowerbed.length-1 || flowerbed[i + 1] == 0)) {
                flowerbed[i]=1;
                count++;
            }
            i++;
        }

        return count>=n;

    }
}

package Dailyprograms;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setofinteger {
    /*
    11 STEP APPROACH FOR PROBLEM SOLVING
========================================
1.Understanding the problem to detailed level(input and output, constrain) - Yes
input - int[] array   out put int[]
2.Frame Test data (valid, invalid and edge cases) - Yes
    Input	1,2,2,4		Output	2,3
    Input	1,2,3,3,5	Output	3,4
    Input	1134		Output	1 2
    Input 1 2 3 3       output 3 4

3.Do you know the solution or else ask for hint? -trying with my logic
4.Do you have any alternate approaches? find the best appraoch? no
5.Write Pseudo code in paper  - Yes
6.Dry run the pseudo code with prepared Test Data  - Yes
7.Write the code on paper - Yes
8.Check for complie time errors - Yes
9.write code on IDE - Yes
10.Debug the code if any failures - Yes
11.Optimise the code

Pseudocode:
1. declare the 2 int variables missing and duplicate
2. save the num.length in int n
3. iterate over the array with n as length

     */


    @Test
    public void test1(){
        String string = Arrays.toString(setOfInteger(new int[]{1, 2, 2, 4}));
        System.out.println(string);
    }
    @Test
    public void test2(){
        String string = Arrays.toString(setOfInteger(new int[]{1,2,3,3,5}));
        System.out.println(string);
    }
    @Test
    public void test3(){
        String string = Arrays.toString(setOfInteger(new int[]{1, 2, 3, 3}));
        System.out.println(string);
    }
    @Test
    public void test4(){
        String string = Arrays.toString(setOfInteger(new int[]{1,1,3,4}));
        System.out.println(string);
    }


    public int[] setOfInteger(int[] nums){

        int n=nums.length;
        Set<Integer> seen = new HashSet<>();

        int duplicate=-1;
        int missing = -1;

        for (int num:nums) {
            if(seen.contains(num)){
                duplicate = num;
            }
            else{
                seen.add(num);
            }
        }

        for (int i = 1; i <=n; i++) {
            if(!seen.contains(i)) {
                missing=i;
                break;

            }

        }


        return new int[] {duplicate,missing};
    }
}

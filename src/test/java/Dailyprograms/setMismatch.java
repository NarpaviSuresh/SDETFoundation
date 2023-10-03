package Dailyprograms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class setMismatch {
    /*
	 https://leetcode.com/problems/set-mismatch/description/

	Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.



Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]

	#pseudocode
	----------
	#Output: boolean


	#Input: int[]
	#Outpur: int[]
	#Sorting the array
	#initialize dup, miss=0
	#Find the duplicate values and stored in dup
	#find the missing value stored in miss
	#return the dup and miss as array
	 */

    public int[] setMismatch(int[] nums){
        Arrays.sort(nums);
        int miss=nums.length;
        int dupe=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums[i+1]){
                dupe=nums[i];
                break;
            }

        }
        for (int i = nums.length-1; i>=0;i--) {
            if(nums[i]==miss){
                miss--;
            }
        }

        return new int[] {dupe,miss};
    }

    @Test
    public void findErrorNumsPositive1()
    {
        String string1=Arrays.toString(setMismatch(new int[] {3,2,3,4}));
        String string = Arrays.toString(new int[]{3, 1});
        Assert.assertEquals(string,string1);
    }
    @Test
    public void findErrorNumsPositive2()
    {
        String string1=Arrays.toString(setMismatch(new int[] {2,2,3,4}));
        String string = Arrays.toString(new int[]{2, 1});
        Assert.assertEquals(string,string1);
    }
}

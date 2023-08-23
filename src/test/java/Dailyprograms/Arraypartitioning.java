package Dailyprograms;

import org.junit.Test;

import java.util.Arrays;

public class Arraypartitioning {

    /*
   Input: nums = [1,4,3,2]
Output: 4
Input: nums = [6,2,6,5,1,2]
Output: 9
     */
    @Test
    public void test1() {
        int i = arrayPairSum(new int[]{1,4,3,2});
        System.out.println(i);
    }
    @Test
    public void test2() {
        int i = arrayPairSum(new int[]{6,2,6,5,1,2});
        System.out.println(i);
    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length;i+=2){
           sum+=nums[i];
        }
        return sum;
    }
}



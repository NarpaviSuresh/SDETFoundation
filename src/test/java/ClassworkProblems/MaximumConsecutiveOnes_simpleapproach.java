package ClassworkProblems;

import org.junit.Assert;
import org.junit.Test;

public class MaximumConsecutiveOnes_simpleapproach {
    /*
    Input: nums = [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     */
    @Test
    public void test1(){
        int i = maximumConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1});
        Assert.assertEquals(3,i);
    }

    public int maximumConsecutiveOnes(int[] nums){

        int maxCount=0;
        int currentCount=0;


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                currentCount++;
            }
            else{
                maxCount=Math.max(maxCount,currentCount);
                currentCount=0;
            }
        }

        return Math.max(maxCount, currentCount);
    }
}

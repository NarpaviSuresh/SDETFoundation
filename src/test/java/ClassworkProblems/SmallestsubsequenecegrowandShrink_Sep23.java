package ClassworkProblems;

import org.junit.Assert;
import org.junit.Test;

public class SmallestsubsequenecegrowandShrink_Sep23 {

    @Test
    private void tc1(){
        Assert.assertEquals(3, smallestSubArray(new int[]{1,2,3,4,5}, 10));
        Assert.assertEquals(2, smallestSubArray(new int[]{1,2,4,4,1}, 7));
        Assert.assertEquals(-1, smallestSubArray(new int[]{1,2,3,4,5}, 22));
        Assert.assertEquals(1, smallestSubArray(new int[]{1,2,3,4,6}, 5));
    }

    private int smallestSubArray(int[] input, int k ){
        int left = 0, right = 0, output = input.length, currentSum = 0;

        while(right <= input.length){
            if(currentSum > k){
                output = Math.min(output, right-left);
                currentSum -= input[left];
                left++;
            }else {
                if(right == input.length)
                    break;
                currentSum += input[right];
                right++;
            }
        }
        return currentSum < k && output == input.length ? -1 : Math.min(output, right-left+1);
    }
}


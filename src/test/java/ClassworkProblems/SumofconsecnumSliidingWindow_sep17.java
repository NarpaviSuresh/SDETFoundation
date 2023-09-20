package ClassworkProblems;

import org.junit.Test;

public class SumofconsecnumSliidingWindow_sep17 {

    @Test
    public void test1(){
        int i = slidingWindow(new int[]{1,6,8,9,4}, 3);
        System.out.println(i);
    }

    private int slidingWindow(int[] nums, int k){
        //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;

        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];

        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum += nums[pointer];
            currentSum-= nums[pointer++-k];
            pointer++;
        }

        return Math.max(currentSum, max);
    }
//currentSum += nums[pointer];
//currentSum-= nums[pointer++-k];
//
//to ease out the understanding of the sliding window pointer movement use the above code instead of
//
//currentSum += nums[pointer] - nums[pointer++-k];
}

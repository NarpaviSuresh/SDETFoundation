package ClassworkProblems;

import org.junit.Test;

import java.util.Arrays;

public class Minimumpossibledifference_Sep17 {

    @Test
    public void test1(){
        int i = minimumPossibleDifference(new int[]{8, 6, 7, 9});
        System.out.println(i);
    }

        public  int minimumPossibleDifference(int[] nums) {
            // Initialize the minimum possible difference.
            int minimumdiff = Integer.MAX_VALUE;
            Arrays.sort(nums);

            // Iterate over the array.
            for (int i = 0; i < nums.length-1; i++) {
                // For each element, iterate over the rest of the array.
                for (int j = i + 1; j < nums.length-1; j++) {
                    // Calculate the difference between the two elements.
                    int difference = nums[j] - nums[i];

                    // If the difference is smaller than the minimum possible difference, update the minimum possible difference.
                    if (difference < minimumdiff) {
                        minimumdiff = difference;
                    }
                }
            }

            // Return the minimum possible difference.
            return minimumdiff;
        }
}

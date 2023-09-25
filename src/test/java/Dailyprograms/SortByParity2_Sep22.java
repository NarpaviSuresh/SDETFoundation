package Dailyprograms;

import org.junit.Test;

import java.util.Arrays;

public class SortByParity2_Sep22 {

    @Test
    public void test1(){
        int[] result = sortArrayByParityII(new int[]{4, 2, 5, 7, 3, 1});
        System.out.println(Arrays.toString(result));
    }
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int evenIndex = 0; // Pointer for even positions
        int oddIndex = 1;  // Pointer for odd positions

        for (int num : nums) {
            if (num % 2 == 0 && evenIndex < n) {
                // If the current number is even and there are even positions left,
                // place it at evenIndex and increment evenIndex by 2.
                result[evenIndex] = num;
                evenIndex += 2;
            } else if (num % 2 == 1 && oddIndex < n) {
                // If the current number is odd and there are odd positions left,
                // place it at oddIndex and increment oddIndex by 2.
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return result;
    }
}

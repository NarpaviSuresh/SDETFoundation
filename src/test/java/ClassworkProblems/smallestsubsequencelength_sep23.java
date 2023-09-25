package ClassworkProblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class smallestsubsequencelength_sep23 {

    @Test
    public void test1() {
        int i = smallestSubsequenceLength(new int[]{3, 5, 2, 1, 4}, 10);
        Assert.assertEquals(i, 3);
    }

    public static int smallestSubsequenceLength(int[] array, int k) {
        // Sort the array in ascending order.

        // Initialize the subsequence length and the current sum.
        int subsequenceLength = 0;
        int currentSum = 0;

        // Iterate over the array, adding elements to the subsequence until the current sum is greater than or equal to k.
        for (int element : array) {
            currentSum += element;
            subsequenceLength += 1;
            if (currentSum >= k) {
                return subsequenceLength;

            }
        }
        return subsequenceLength;
    }
}


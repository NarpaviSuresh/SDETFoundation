package Dailyprograms;

import org.junit.Test;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class CountArithmeticTripletsTwoPointers {
    /*
    https://leetcode.com/problems/number-of-arithmetic-triplets/description/
    You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

        i < j < k,
        nums[j] - nums[i] == diff, and
        nums[k] - nums[j] == diff.
        Return the number of unique arithmetic triplets.


1.Understanding the problem to detailed level (clarity on input and output, constraints) Yes

2.Frame Test data (valid, invalid, complex and edge cases)

3.Do you know the Solution?

4.Do you have any alternate approaches? (Thing of alternate approaches)

5. Derive Pseudo code in paper (for the best chosen approach)

6. Dry run the pseudo code with all test data from step #2

7. Write the code on notepad

8. Dry run the code with all test data from step #2

9. Write code on IDE (remember to add comments and practice coding standards)

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE

11. Check for any gaps of code optimization (if not optimized already in Step #9)

            Pseudcode
            declare the count variable
            declare left and right pointer
            while right is less than arraylength
            nums[right]-nums[left]==diff
            increment counter
            increment left
            increment right
            continue the loop until next result
            increment the right
            return count

     */
    @Test
    public void test1() {
        int i = countArithmeticTriplets(new int[]{1, 3, 5, 7, 9}, 2);
        System.out.println(i);
    }
    @Test
    public void test2() {
        int i = countArithmeticTriplets(new int[]{4,5,6,7,8,9}, 2);
        System.out.println(i);
    }
    public int countArithmeticTriplets(int[] nums, int diff) {
        int n = nums.length-1;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = i + 2;

            while (right < n) {
                int currentDiff = nums[right] - nums[left];

                if (currentDiff == diff) {
                    count++;
                    left++;
                    right++;
                } else if (currentDiff < diff) {
                    right++;
                } else {
                    left++;
                }
                // Ensure that left and right pointers are not equal
                if (left == right) {
                    right++;
                }
            }
        }

        return count;

    }
}



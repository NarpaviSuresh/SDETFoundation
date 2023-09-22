package Dailyprograms;

import org.junit.Test;

public class FindtheArrayConcatenationValue_SEP21 {
/*
11 Steps Approach

1.Understanding the problem to detailed level (clarity on input and output, constraints) Yes

2.Frame Test data (valid, invalid, complex and edge cases)


3.Do you know the Solution?

4.Do you have any alternate approaches? (Thing of alternate approaches) no

5. Derive Pseudo code in paper (for the best chosen approach)

6. Dry run the pseudo code with all test data from step #2

7. Write the code on notepad

8. Dry run the code with all test data from step #2

9. Write code on IDE (remember to add comments and practice coding standards)

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE

11. Check for any gaps of code optimization (if not optimized already in Step #9)
 */

    /*
    Pseudocode:
    Declare the left and right pinter
    declare the sum variable
    while left <=right
    get the left value and change it to string
    get the right value and change it to string
    concatenate the left and right value and store in sum
    left++
    right--

     */

    @Test
    public void test1(){
        int i = findtheArrayConcatenationValue_SEP21(new int[]{7, 52, 2, 4});
        System.out.println(i);
    }
  public int findtheArrayConcatenationValue_SEP21(int[] nums){

          // Initialize pointers
          int left = 0;
          int right = nums.length - 1;

          // Initialize concatenation value
          int concatenationValue = 0;

          while (left <= right) {
              // Convert integers to strings for concatenation
              String leftStr = Integer.toString(nums[left]);
              String rightStr = Integer.toString(nums[right]);

              // Calculate concatenation of left and right elements
              int concatLeftRight = Integer.parseInt(leftStr + rightStr);

              // Update the concatenation value
              concatenationValue += concatLeftRight;

              // Move pointers

                  left++;

                  right--;
              }


          return concatenationValue;
      }
}

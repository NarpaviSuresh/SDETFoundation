package Dailyprograms;

import org.junit.Test;

import java.util.Arrays;

public class SortArrayByParity {
    /*
     https://leetcode.com/problems/sort-array-by-parity/
     Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     Return any array that satisfies this condition.
    11 Steps Approach

1.Understanding the problem to detailed level (clarity on input and output, constraints) Yes

2.Frame Test data (valid, invalid, complex and edge cases) Yes

3.Do you know the Solution? Yes

4.Do you have any alternate approaches? (Thing of alternate approaches) No

5. Derive Pseudo code in paper (for the best chosen approach)Yes

6. Dry run the pseudo code with all test data from step #2Yes

7. Write the code on notepad Yes

8. Dry run the code with all test data from step #2 Yes

9. Write code on IDE (remember to add comments and practice coding standards) Yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE Yes

11. Check for any gaps of code optimization (if not optimized already in Step #9)
     */

    @Test
    public void test1(){
        int[] ints = sortArrayByParity(new int[]{3,4,5,6});
        System.out.println(Arrays.toString(ints));
    }

    public void test2(){
        int[] ints = sortArrayByParity(new int[]{3,1,2,4});
        System.out.println(Arrays.toString(ints));
    }
    public int[] sortArrayByParity(int[] nums){

        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0){
                i++;}
            if(nums[j]%2==0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                         i++;
                        j--;
            }
            else{
                j--;
            }
        }
        return nums;
    }
}

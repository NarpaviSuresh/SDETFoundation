package ClassworkProblems;

import org.junit.Test;

import java.util.Arrays;

public class ReverseArraywwithindices_sep16 {
    /*Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        Input: nums = [2,3,5,7], target = 9
        Output: [0,3]
        Output: Because nums[0] + nums[3] == 9, we return [0, 3].

        input: int array, int
        output int array

        Test data:
        [2,3,5,7], target=9;   output [0,3]

        pseudocode:
    Declare left and right variables
    while(left<=right)
    add the left +right and store in sum varible
    if sum is equal to target
*/
    @Test
    public void test1(){
        int[] ints = reverseArray(new int[]{1, 2, 3, 4}, 3);
        System.out.println(Arrays.toString(ints));
    }
    @Test
    public void test2(){
        int[] ints = reverseArray(new int[]{1, 2, 3, 4}, 7);
        System.out.println(Arrays.toString(ints));
    }
    public int[] reverseArray(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
        int sum = nums[left]+nums[right];
        if(sum==target){
            return new int[]{left,right};
        }
        else if(sum<target){
            left++;
        }
        else{
            right--;
        }
        }
        return new int[]{};
    }

}

package Foundation;

import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicatesinArray {

    @Test
    public void test(){
        int[] ints = removeDuplicatesinArray(new int[]{1, 2, 3, 2, 3}, 2);
        System.out.println(Arrays.toString(ints));
    }

    public int[] removeDuplicatesinArray(int[] nums, int target){
        int[] result = new int[nums.length];
        int index=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=target){
                result[index]=nums[i];
                index++;
            }
        }
        return Arrays.copyOf(result,index);
    }
}

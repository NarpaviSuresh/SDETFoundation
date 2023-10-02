package ClassworkProblems;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {

    @Test
    public void test1(){
        int[] ints = twoSUm(new int[]{2, 7, 11, 13}, 9);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSUm(int[] nums, int target){
        Map<Integer, Integer> map= new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {

        if(map.containsKey(target-nums[i])){
            return new int[] {map.get(target-nums[i]),i};
        }
        map.put(nums[i],i);
        }
        return nums;
    }
}

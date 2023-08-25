package Dailyprograms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Summaryrange {

    @Test
    public void test() {
        List<String> strings = summaryRange(new int[]{2,3,4,6,7,8,10,11});
        System.out.println(strings);
    }
    public List<String> summaryRange(int[] nums) {

        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start != nums[i]) {
                result.add(start + "->" + nums[i]);
            } else {
                result.add(Integer.toString(start));
            }
            i++;
        }

        return result;
    }
}



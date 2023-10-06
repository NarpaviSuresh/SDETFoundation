package Dailyprograms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Oct6_Findallthedisappearedinarray {

    /*
    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

    time complexity o(n)
    space complexity o(n)
     */
        @Test
        public void test(){
            List<Integer> disappearedNumbers = findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
            System.out.println(disappearedNumbers);
        }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNo = new ArrayList<>();

        Set<Integer> numset = new HashSet<>();

        for (int  num: nums) {
            numset.add(num);
        }

        for (int i = 1; i < nums.length ; i++) {
            if(!numset.contains(i)){
                missingNo.add(i);
            }
        }
        return missingNo;
    }
}

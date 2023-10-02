package ClassworkProblems;

import org.junit.Test;

import java.util.Arrays;

public class TwoSum_Sep30 {

    @Test
    public void test1(){
        int[] ints = twoSum(new int[]{2, 2, 4, 3}, 6);
        System.out.println(Arrays.toString(ints));
    }
    public int[] twoSum(int[] sum, int target){

        for (int i = 0; i < sum.length-1 ; i++) {
            for (int j = i+1; j < sum.length-1; j++) {
                if((sum[i]+sum[j])==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}

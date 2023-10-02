package ClassworkProblems;

import org.junit.Test;

import java.util.HashSet;

public class SingleNumberUsingHAshset {

    @Test
    public void test(){
        int i = singleNumber(new int[]{2, 2, 1, 4});
    }
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(i)){
                set.add(i);
                count++;
            }
               else{
                   set.remove(i);

            }
        }
        
        return count;
    }

}

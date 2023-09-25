package ClassworkProblems;

import org.junit.Test;

public class largestsumandreturnsum_sep24 {

    @Test
    public void test1(){
        int i = largestsumandreturnsum_sep24(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }
    public int largestsumandreturnsum_sep24(int[] nums){
        int maximum=0, currentmaximum=0;
        for (int i = 0; i < nums.length ; i++) {
            if(currentmaximum<0){
                currentmaximum=0;

            }else if(currentmaximum>=0){
                currentmaximum=nums[i];
                maximum=Math.max(maximum,currentmaximum);
            }
        }
        return maximum;
    }
}

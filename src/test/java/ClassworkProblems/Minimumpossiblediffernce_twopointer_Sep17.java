package ClassworkProblems;

import org.junit.Test;

import java.util.Arrays;

public class Minimumpossiblediffernce_twopointer_Sep17 {
    @Test
    public void test1(){
        int i = minimumpossiblediff(new int[]{1,5,3,7});
        System.out.println(i);
    }
    public int  minimumpossiblediff(int[] num){

//        initialize the two pinter left and rightboth to the beginning of the array
        int left=0;
        int right=1;
        Arrays.sort(num);

//        decalre the minimumdifference
        int minimumdiff = Integer.MAX_VALUE;

//        while the right pointer less than length of array
        while(right < num.length){
            //calculate the diff between the current elements
            int diff = num[right]-num[left];

            //if diff is smaller than minimum diff update the minimumdiff
            if(diff<minimumdiff){
                minimumdiff=diff;
            }
            if(diff>0){
                left++;
            }else{
                right++;
            }
        }
        return minimumdiff;
    }
}

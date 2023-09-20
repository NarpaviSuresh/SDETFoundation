package ClassworkProblems;

import org.junit.Test;

public class Sumofconsecutiveelements_sep17 {

   /* if problem is to find for maximun value declare max value as Integer.MIN-value
   if problem is to find for minimum value declare max value as Integer.MAX_value
    */
    /*
    input: int array and target
    output: int[]
    Test data:
    1,3,6,9,8,4,5 = output 698
    8,7,9,6,5,3,9,8,5,4,5, out 879


    pseudocode:
    delcare the forloop and interate till length of i
    int sum;
    add the consecutive values of i and store in current sum
    declare maximum sum variable
    if current sum greater than max sum assign the value to max sum
    if current sum is negative reset it to 0;

     */
    @Test
    public void test1(){
        int i = highestnumofCosecutiveelemtns(new int[]{1, 3, 6, 9, 8, 4, 5}, 4);
        System.out.println(i);
    }
    public int highestnumofCosecutiveelemtns(int [] num, int target){

        // initialize the current sum and max sum
        int currentSum=0;
        int maxsum=Integer.MIN_VALUE;
        //iterate over the array
        for (int i = 0; i <=num.length-target; i++) {
            currentSum = num[i];
            //update the current sum
            for (int j = i + 1; j < i + target; j++) {
                currentSum += num[j];

                // checking the current sum is greate than max sum

                if (currentSum > maxsum)
                    maxsum = currentSum;
            }
        }
        return maxsum;
    }
}

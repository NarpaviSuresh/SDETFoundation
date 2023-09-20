package ClassworkProblems;

import org.junit.Test;

import java.util.Arrays;

public class Movethezeroestoend_Sep16 {
/*

    input: int[] num
    output int[]
     Test data: [0,3,0,5,0,6]
     Output: [3,5,6,0,0,0]

     Pseudocode:

      iterate over the nums array till length of nums
    start the second array with next index of first array
    if indice i value is 0 swap it to j value  temp variable


    */

    @Test
    public void test1(){
        int[] ints = moveTheZero(new int[]{0, 3, 0, 5, 0, 6});
        System.out.println(Arrays.toString(ints));
    }
    @Test
    public void test2(){
        int[] ints = moveTheZero(new int[]{0, 0, 0, 0, 0, 1});
        System.out.println(Arrays.toString(ints));
    }
    @Test
    public void test3(){
        int[] ints = moveTheZero(new int[]{0, 0, 0, 0, 1, 0});
        System.out.println(Arrays.toString(ints));
    }
//    public int[] moveTheZero(int[] num){
//        int temp;
//        for (int i = 0; i < num.length ; i++) {
//            for (int j = i+1; j < num.length; j++) {
//                    if(num[i]==0) {
//                        temp = num[i];
//                        num[i] = num[j];
//                        num[j] = temp;
//                    }
//                }
//            }
//        return num;
//    }

    public int[] moveTheZero(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }else {
                i++;
            }
        }
        return nums;
    }
}

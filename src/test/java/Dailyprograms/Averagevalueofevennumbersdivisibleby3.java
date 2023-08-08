package Dailyprograms;

import org.junit.Assert;
import org.junit.Test;



public class Averagevalueofevennumbersdivisibleby3 {

    @Test
    public void test1(){
        int actual= averageValue(new int[] {1,3,6,10,12,15});
//        Assert.assertEquals(9,actual);
        System.out.println(actual);
    }
    @Test
    public void test2(){
        int actual= averageValue(new int[] {1,2,4,7,10});
//        Assert.assertEquals(9,actual);
        System.out.println(actual);
    }

    public int averageValue(int[] nums) {
        int sum=0;
        int count = 0;
       for (int i = 0; i< nums.length; i++){
           if(nums[i]%6==0){
                sum=sum+nums[i];
                count++;
           }
       }
       if(count==0){
           return 0;
       }
        return sum/count;
    }
}

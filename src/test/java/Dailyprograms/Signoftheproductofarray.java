package Dailyprograms;

import org.junit.Test;

public class Signoftheproductofarray {
    @Test
    public void test1(){
        int actual=arraySign(new int[] {-1,-2,-3,-4,3,2,1});
//        Assert.assertEquals(-1,actual);
        System.out.println(actual);
    }
    @Test
    public void test2(){
        int actual=arraySign(new int[] {1,5,0,2,-3});
//        Assert.assertEquals(-1,actual);
        System.out.println(actual);
    }
    @Test
    public void test3(){
        int actual=arraySign(new int[] {-1,1,-1,1,-1});
//        Assert.assertEquals(-1,actual);
        System.out.println(actual);
    }
    public int arraySign(int[] nums) {
        int sign=1;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==0){
                return 0;
            } else if (nums[i]<0) {
                sign=-sign;
            }
        }
        return sign;
    }


}

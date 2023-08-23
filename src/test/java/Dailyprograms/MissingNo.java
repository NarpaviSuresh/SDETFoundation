package Dailyprograms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MissingNo {

    /*

    test data
    [1,3,4]		           2
    [0,1,3]		           2
    [0,1,2,3,4,7,5,8]		6
    [6,8,9,10]		        7
    [9,6,4,2,3,5,7,0,1]		8
    [0,1]


    pseudocode

1) Sort the array
2)iterate over the num array
3) compare the array index value and num value if it is not matching
return the index value
     */

    @Test
    public void test(){
        int i = missingNo(new int[]{0, 1, 3});
        Assert.assertEquals(i,2);
    }
    @Test
    public void test1(){
        int i = missingNo(new int[]{0,1,2,3,4,7,5,8});
        Assert.assertEquals(i,6);
    }
    @Test
    public void test2(){
        int i = missingNo(new int[]{9,6,4,2,3,5,7,0,1});
        Assert.assertEquals(i,8);
    }

    public int missingNo(int[] num){

        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if(i!=num[i]){
                return i;
            }
        }
        return 0;
    }
}

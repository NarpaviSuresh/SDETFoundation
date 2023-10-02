package Foundation;

import org.junit.Test;

public class Adddigits {
    /*
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.



Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
     */
    @Test
    public void test(){
        int i = addDigits(123456);
        System.out.println(i);
    }
    public int addDigits(int num){
        int sum=0;
        if(num==0) return 0;
        while (num>0){
            sum=sum+num%10;
            num/=10;
        }
        if(sum<10){
            return sum;
        }
        else
        return addDigits(sum);
    }
}

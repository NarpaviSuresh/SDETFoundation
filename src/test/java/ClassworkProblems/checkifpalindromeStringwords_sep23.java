package ClassworkProblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class checkifpalindromeStringwords_sep23 {

    @Test
    public void test1(){
        boolean[] result = validatePalindrome("This is a tst");
        Assert.assertEquals(result, Arrays.toString(result));
    }
    public static boolean[] validatePalindrome(String inputString) {
    int start , end;
    String[] words = inputString.split(" ");
    boolean[] status = new boolean[inputString.length()-1];
        for (int i = 0; i < inputString.length()-1; i++) {
            boolean isPalindrome = true;
            int left=0;
            int right=words[i].length()-1;
            while(left<right)
            {
                if(words[i].charAt(left)!=words[i].charAt(right)){
                    isPalindrome=false;
                    break;
                }
                left++;
                right--;

            }
            status[i]=isPalindrome;
        }
        return status;
    }
    }
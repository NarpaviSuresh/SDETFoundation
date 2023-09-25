package ClassworkProblems;

import org.junit.Test;

public class CheckPalindromeNumberusingExpandfromCenter_sep23 {

    @Test
    public void test(){
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);

    }
    public boolean isPalindrome(int n){

        int left=0;
        int right = n/10;
        while(left<right){
            if(n%10!=right%10){
                return false;
            }
            n/=10;
            right/=10;
            left++;
        }

        return true;
    }
}

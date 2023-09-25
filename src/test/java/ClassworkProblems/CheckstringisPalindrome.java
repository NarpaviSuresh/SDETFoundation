package ClassworkProblems;

import org.junit.Test;

public class CheckstringisPalindrome {

    @Test
    public void test1(){
        boolean radar = isPalindrome("RADAR");
        System.out.println(radar);
    }

    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}

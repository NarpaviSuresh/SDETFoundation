package Foundation;

import org.junit.Test;

public class PalindromeNumber {

    @Test
    public void test() {
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }

    public boolean isPalindrome(int n) {
        int reverse=0;
        int original=n;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse*10+digit;
            n/=10;

        }
        return reverse==original;
    }
}
package Dailyprograms;

import org.junit.Test;

public class CheckifNumberHasEqualDigitCountandDigitValue {
    /*
    Pseudocode:
    Initialize two pointers, left and right.
    Iterate over the string in opposite directions using two pointers
    Check if the digit at the left pointer is equal to the index of the left pointer.
    if true return false
    increment the left value and decrement right value and return true
    */

    @Test
    public void test1(){
        boolean b = digitCount(String.valueOf(1210));
        System.out.println(b);
    }

        public static boolean digitCount(String num) {
            int left = 0;
            int right = num.length() - 1;
                while (left <= right) {
                    if (num.charAt(left) - '0' != left) {
                        return false;
                    }
                    if (num.charAt(right) - '0' != right) {
                        return false;
                    }
                left++;
                right--;
            }
            return true;
        }
    }


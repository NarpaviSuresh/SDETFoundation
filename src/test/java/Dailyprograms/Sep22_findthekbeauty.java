package Dailyprograms;

import org.junit.Test;

public class Sep22_findthekbeauty {

    /*
    2269. Find the K-Beauty of a Number
Easy
Topics
Companies
Hint
The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:

It has a length of k.
It is a divisor of num.
Given integers num and k, return the k-beauty of num.

Note:

Leading zeros are allowed.
0 is not a divisor of any value.
A substring is a contiguous sequence of characters in a string

pseudocode:
Convert the integer num to its string representation using Integer.toString(num).

Initialize a count variable to keep track of the number of substrings that meet the conditions.

Use a sliding window approach to iterate through all substrings of length k. The loop runs from index i = 0 to i = numStr.length() - k to ensure that we consider all possible substrings.

Extract the substring of length k using substring(i, i + k) and parse it back to an integer subNum.

Check if subNum is not equal to 0 and if num is divisible by subNum. If both conditions are met, increment the count.

Finally, return the count, which represents the number of substrings of length k that are divisors of num.
     */

    @Test
    public void test1(){
        int i = kBeauty(240, 2);
        System.out.println(i);
    }
    public int kBeauty(int num, int k) {
        String numStr = Integer.toString(num);
        int count = 0;

        for (int i = 0; i <= numStr.length() - k; i++) {
            String substring = numStr.substring(i, i + k);
            int subNum = Integer.parseInt(substring);

            if (subNum != 0 && num % subNum == 0) {
                count++;
            }
        }

        return count;
    }
}

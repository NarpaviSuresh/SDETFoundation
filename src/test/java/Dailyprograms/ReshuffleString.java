package Dailyprograms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReshuffleString {
/*
    https://leetcode.com/problems/shuffle-string/

    You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

    Return the shuffled string.

    Input: String and integer array
    Output String

    Test data:

    String s = "KumarSuresh" indices = [6,7,8,9,10,0,1,2,3,4,5]

    Able to think the bruteforce logic : Yes

    Pseudocode:

    Create the list and add the string in list
    iterate over the indices array and add the corresponding character from the string s to the new String
    return the shuffled string
 */
    @Test
    public void test1(){
        String result = shuffledString("kumarsuresh", new int[]{6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5});
        System.out.println(result);
    }
    public void test2(){
        String result = shuffledString("kumarsuresh", new int[]{6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5});
        System.out.println(result);
    }

    public String shuffledString(String s, int[] indices){
        // Create a list to store the shuffled characters.
        List<Character> shuffled = new ArrayList<>();
        // Iterate over the indices array and add the corresponding character from the original string to the shuffled list.
        for (int i = 0; i < indices.length; i++) {
            shuffled.add(s.charAt(indices[i]));
        }

        return shuffled.toString();
    }
}

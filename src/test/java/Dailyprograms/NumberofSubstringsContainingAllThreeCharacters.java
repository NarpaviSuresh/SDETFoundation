package Dailyprograms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberofSubstringsContainingAllThreeCharacters {
/*
https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.
 */
    /*

      int count=0;
        // initialize the left and right variable
        int left=0, right =0;
//        initialize the set to sore the unique characters
        Set<Character> set = new HashSet<>();

//        while right is less length of string
        while(right<s.length()-2){
//            add the character to set
        set.add(s.charAt(right));
//            if set contains three unique characters
        if(set.size()==3){
            count++;
            set.remove(s.charAt(left));
            left++;
        }
        right++;
        }
        return count;
     */
    @Test
    public void test(){
        int result = numberofSubstringsContainingAllThreeCharacters("abcabc");
        System.out.println(result);
    }
public int numberofSubstringsContainingAllThreeCharacters(String s){
    // Initialize the counter of good substrings
        int count=0;
    // Initialize two pointers, left and right
        int left=0;
        int right=0;
    // Initialize three sets to store the presence of characters `a`, `b`, and `c`
    List<Character> list1 = new ArrayList<>();
    List<Character> list2 = new ArrayList<>();
    List<Character> list3 = new ArrayList<>();

    while(right <s.length()){
        // Add the current character to the corresponding set
        if(s.charAt(right)=='a'){
            list1.add('a');
        } else if (s.charAt(right)=='b') {
            list2.add('b');
        }
        else {
            list3.add('c');
        }
        // If all three sets contain at least one element
        if(list1.size()>0 && list2.size() >0&& list3.size()>0){
            // Increment the counter
            count++;
            //move left pointer
            left++;
        }
        // move the right pointer
        right++;
    }
    return count;
}

}

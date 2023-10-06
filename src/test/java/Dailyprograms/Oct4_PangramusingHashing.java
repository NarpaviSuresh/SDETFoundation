package Dailyprograms;

import org.junit.Test;

import java.util.HashSet;

public class Oct4_PangramusingHashing {
    /*
    https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
    A pangram is a sentence where every letter of the English alphabet appears at least once.
    Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

    Pseudocode:
    declare hashset and add the character of sentence
    if size of set is equals to 26 return true else false

     Time complexity: O(n)
     Space complexity: O(1)

     */

    @Test
    public void test1(){
        boolean status = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(status);
    }

    @Test
    public void test2(){
        boolean status = checkIfPangram("leetcode");
        System.out.println(status);
    }
    public boolean checkIfPangram(String sentence) {

        HashSet<Character> set = new HashSet<>();

        for (char c:sentence.toCharArray()){
            set.add(c);
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }
}

package Dailyprograms;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class Oct5_CountofNumberofConsistentstrings {

/*
https://leetcode.com/problems/count-the-number-of-consistent-strings/
 time complexity o(n+n)
 space o(n)
 */
    @Test
    public void test1() {
        Assert.assertEquals(7,countConsistentStrings("abc", new String [] {"a","b","c","ab","ac","bc","abc"}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2,countConsistentStrings("ab", new String [] {"ad","bd","aaab","baa","badab"}));
    }

    @Test
    public void test3() {
        Assert.assertEquals(4,countConsistentStrings("cad", new String [] {"cc","acd","b","ba","bac","bad","ac","d"}));
    }
    public int countConsistentStrings(String allowed, String[] words) {
//        Create a hash set to store the allowed characters.
        HashSet<Character> set = new HashSet<>();
        for (char c: allowed.toCharArray()) {
            set.add(c);
        }
// Count the number of consistent strings.
        int countConsistentstring=0;
        for (String word:words){
            boolean isConsistent=true;
            for (char c:word.toCharArray()) {
                if(!set.contains(c)){
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent){
                countConsistentstring++;
            }
        }

        return countConsistentstring;
    }
}   

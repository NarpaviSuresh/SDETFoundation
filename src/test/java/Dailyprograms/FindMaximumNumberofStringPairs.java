package Dailyprograms;

import org.junit.Test;

import java.util.HashMap;

public class FindMaximumNumberofStringPairs {
    /*
    https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
    You are given a 0-indexed array words consisting of distinct strings.

The string words[i] can be paired with the string words[j] if:

The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.

Note that each string can belong in at most one pair.



1.Understanding the problem to detailed level (clarity on input and output, constraints) Yes

2.Frame Test data (valid, invalid, complex and edge cases)
        String[] input = {"ab","ba","dc","cd","zz","aa"} output 2
        String[] input = {"ab","ab","cd","cd","ef","ef"} output 3
3.Do you know the Solution? Yes

4.Do you have any alternate approaches? (Thing of alternate approaches) No

5. Derive Pseudo code in paper (for the best chosen approach)
     Yes
6. Dry run the pseudo code with all test data from step #2 Yes

7. Write the code on notepad -Yes

8. Dry run the code with all test data from step #2 Yes

9. Write code on IDE (remember to add comments and practice coding standards) - Yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE yes

11. Check for any gaps of code optimization (if not optimized already in Step #9)
     */


    public String reversedString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
     public int maxPairOfStrings(String[] words){
        int maxPairs=0;
         HashMap<String, Integer> reverseCount = new HashMap<>();
         for (String word: words) {
             String reverseString = reversedString(word);
             if(reverseCount.containsKey(reverseString) && reverseCount.get(reverseString)>0){
                 maxPairs++;
                 reverseCount.put(reverseString, reverseCount.get(reverseString) - 1);
             }
             else{
                 reverseCount.put(word, reverseCount.getOrDefault(word,0) + 1);
             }

         }
         return maxPairs;
     }

    @Test
    public void test(){
        int i = maxPairOfStrings(new String[]{"cd", "ac", "dc", "ca", "zz"});
        System.out.println(i);
    }
    @Test
    public void test1(){
        int i = maxPairOfStrings(new String[]{"ab", "ba", "dc", "cd", "zz"});
        System.out.println(i);

    }
}

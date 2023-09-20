package Dailyprograms;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SubstringsofSizewithDistinctCharacters {
/*
    11 Steps Approach

1.Understanding the problem to detailed level (clarity on input and output, constraints)
Input: String
output:int

2.Frame Test data (valid, invalid, complex and edge cases)
	String s = xyzzaz
	output: xyz yzz zza zaz output should not have repeating characters
	Output will be 1 in this cases
3.Do you know the Solution?
    Yes
 4.Do you have any alternate approaches? (Thing of alternate approaches)
        no
 5. Derive Pseud  in paper (for the best chosen approach)
        yes
6. Dry run the pseudo code with all test data from step #2 yes

 7. Write the code on notepad yes

8. Dry run the code with all test data from step #2 yes

 9. Write code on IDE (remember to add comments and practice coding standards) yes

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE yes

11. Check for any gaps of code optimization (if not optimized already in Step #9)

 */

/* BRUTEFORCE
    public int subStringSizewithDistinctCharacter(String s){
//        declarethe count
        int count=0;
//        iterate over the length of the String with 2
        for (int i = 0; i < s.length()-2; i++) {
            //Declaring the Set to store the character
            Set<Character> substring= new HashSet<>();
            //add the characters to set
            substring.add(s.charAt(i));
            substring.add(s.charAt(i+1));
            substring.add(s.charAt(i+2));
            // checking the size of substring
            if(substring.size()==3){
                count++;
            }
        }
        return count;
    }
*/
      /*  Pseudocode
        initialize the count variable
        initialize the left and right variable
        initialize the set to sore the unique characters
        while right is less length of string
        add the character to set
        if set contains three unique characters
        increment the counter
        remove the left character
        increment the left pointer
        increment the right pointer
        return the count
       */
@Test
public void test1(){
    int result = subStringSizewithDistinctCharacter("xyzzaz");
    System.out.println(result);
}
    @Test
    public void test2(){
        int result = subStringSizewithDistinctCharacter("abcaabaca");
        System.out.println(result);
    }
    public int subStringSizewithDistinctCharacter(String s){
        //initialize the count variable
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
    }
}

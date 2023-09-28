package Dailyprograms;

import org.junit.Test;

public class MinimumAdditionTomakevalidString {
    /*
    11 Steps Approach

1.Understanding the problem to detailed level (clarity on input and output, constraints)

2.Frame Test data (valid, invalid, complex and edge cases)

3.Do you know the Solution?

4.Do you have any alternate approaches? (Thing of alternate approaches)

5. Derive Pseudo code in paper (for the best chosen approach)

6. Dry run the pseudo code with all test data from step #2

7. Write the code on notepad

8. Dry run the code with all test data from step #2

9. Write code on IDE (remember to add comments and practice coding standards)

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE

11. Check for any gaps of code optimization (if not optimized already in Step #9)

    Pseudocode
    Initialize two pointers, left and right, both initially set to 0.
Initialize a variable insertions to keep track of the minimum number of insertions needed, starting at 0.
Iterate through the characters of the input string word from left to right:
Get the character at the right pointer, and store it in currentChar.
If currentChar is 'a', increment the left counter.
If currentChar is 'b':
If there are no 'a' characters to pair with 'b', increment insertions by 1.
Otherwise, decrement the left counter by 1 to pair 'a' with 'b'.
If currentChar is 'c':
If there are no 'a' characters to pair with 'c', increment insertions by 2.
Otherwise, decrement the left counter by 1 to pair 'a' with 'c'.
Move the right pointer to the next character.
After processing the entire string, add any remaining 'a' characters (2 * left) to the insertions.
Return the insertions as the minimum number of insertions needed to make the string valid.





     */
    @Test
    public void test1() {
        int aaa = minInsertions("aaa");
        System.out.println(aaa);
    }



    public int minInsertions(String word) {
        int left = 0; // Initialize the left pointer at the beginning of the string
        int right = 0; // Initialize the right pointer at the beginning of the string
        int insertions = 0; // Initialize the count of insertions

        while (right < word.length()) {
            char currentChar = word.charAt(right);

            if (currentChar == 'a') {
                left++; // Increment the left pointer for 'a'
            } else if (currentChar == 'b') {
                if (left == 0) {
                    // If there are no 'a' characters before 'b', insert an 'a'
                    insertions++;
                } else {
                    // If there is at least one 'a' before 'b', pair 'a' and 'b', so decrement left pointer
                    left--;
                }
            } else { // currentChar == 'c'
                if (left == 0) {
                    // If there are no 'a' characters before 'c', insert 'a' and 'b'
                    insertions += 2;
                } else {
                    // If there is at least one 'a' before 'c', pair 'a' and 'c', so decrement left pointer
                    left--;
                }
            }

            right++; // Move the right pointer to the next character
        }

        // After processing the entire string, add any remaining 'a' characters to 'insertions'
        insertions += 2 * left;

        return insertions;
    }
}

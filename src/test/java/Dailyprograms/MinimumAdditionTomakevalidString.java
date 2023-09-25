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
     */
    @Test
    public void test1(){
        int aaa = MinimumAdditionTomakevalidString("aaa");
        System.out.println(aaa);
    }
        public int MinimumAdditionTomakevalidString(String word) {
            int n = word.length();
            int i = 0;
            int j = 0;
            int count = 0;
            while (i < n) {
                if (word.charAt(i) == 'a') {
                    i++;
                    j++;
                } else if (word.charAt(i) == 'b') {
                    if (j == 0) {
                        count++;
                    }
                    i++;
                    j++;
                } else if (word.charAt(i) == 'c') {
                    if (j < 2) {
                        count++;
                    }
                    i++;
                    j++;
                } else {
                    if (j == 0) {
                        count += 1;
                    } else if (j == 1) {
                        count += 2;
                    } else {
                        count += 3;
                    }
                    i++;
                    j = 0;
                }
            }
            if (j < 3) {
                count += 3 - j;
            }
            return count;
        }
    }

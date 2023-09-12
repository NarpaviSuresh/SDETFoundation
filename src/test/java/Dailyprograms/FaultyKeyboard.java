package Dailyprograms;

import org.junit.Test;

public class FaultyKeyboard {

    @Test
    public void test1(){
        String result = reverseKeyboardString("Stringintherain");
        System.out.println(result);
    }
    public String reverseKeyboardString(String s) {
        StringBuilder result = new StringBuilder();
        int iCount = 0; // Count the consecutive 'i' characters

        for (char c : s.toCharArray()) {
            if (c == 'i') {
                iCount++;
            } else {
                // Reverse the characters if there were consecutive 'i' characters
                if (iCount > 0) {
                    result.reverse();
                    iCount = 0; // Reset the count
                }
                result.append(c); // Append the character to the result
            }
        }

        // Reverse the characters if there were consecutive 'i' characters at the end
        if (iCount > 0) {
            result.reverse();
        }

        return result.toString();
    }

}



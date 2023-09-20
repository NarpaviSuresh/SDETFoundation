package Dailyprograms;

public class MakeValidString_Sep15 {

    public static int minInsertions(String word) {
        int insertions = 0;  // Initialize the counter for insertions
        int expectedChar = 'a';  // Initialize the expected character as 'a'

        for (char c : word.toCharArray()) {
            if (c == expectedChar) {
                // If the current character matches the expected character, move to the next expected character
                expectedChar = (expectedChar == 'a') ? 'b' : (expectedChar == 'b') ? 'c' : 'a';
            } else {
                // Calculate the number of insertions needed to make it valid
                insertions++;

                if (c == 'a') {
                    // If the current character is 'a', we need to insert 'bc' to make it valid
                    expectedChar = 'c';  // Move to the next expected character
                } else {
                    // If the current character is 'b' or 'c', we need to insert 'a' to make it valid
                    expectedChar = 'b';  // Move to the next expected character
                }
            }
        }

        // If the expected character is 'a', we may need to add 'bc' to the end of the string to make it valid
        if (expectedChar == 'a') {
            insertions += 2;  // Add 2 insertions for 'bc'
        } else if (expectedChar == 'b') {
            insertions++;    // Add 1 insertion for 'c'
        }

        return insertions;
    }

    public static void main(String[] args) {
        String word = "a";
        int result = minInsertions(word);
        System.out.println("Minimum insertions needed: " + result);
    }
}



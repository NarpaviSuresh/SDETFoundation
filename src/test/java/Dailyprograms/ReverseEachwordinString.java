package Dailyprograms;

import org.junit.Test;

public class ReverseEachwordinString {
/*
    https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
  Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
    Input:  String
    Output: String
    Test data:
    Input: s = "Let's take LeetCode contest"
    Input: s = "God Ding"

    Pseudocode:
                     # Create a StringBuilder object to store the reversed string.
                      # Split the string into words.
                      # Iterate over the words and reverse each word.
                     # Create a StringBuilder object to store the reversed word.
                     # Append the reversed word to the reversed string.
                     # Append a space to the reversed string.
                      # Remove the trailing space from the reversed string.
                       # Return the reversed string.
        */
    @Test
    public void test1(){
        String s = reverseWords("Let's take LeetCode contest");
        System.out.println(s);

    }
    public static String reverseWords(String s) {
        // Create a StringBuilder object to store the reversed string.
        StringBuilder reversedString = new StringBuilder();

        // Split the string into words.
        String[] words = s.split(" ");

        // Iterate over the words and reverse each word.
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }
        // Remove the trailing space.
        reversedString.deleteCharAt(reversedString.length() - 1);
        return reversedString.toString();
    }

}

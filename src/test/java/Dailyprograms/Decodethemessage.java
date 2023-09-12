package Dailyprograms;

import java.util.HashMap;
import java.util.Map;

public class Decodethemessage {


        public String decodeMessage(String key, String message) {
            StringBuilder sb = new StringBuilder();
            // Create a map to store the character substitutions
            Map<Character, Character> temp = new HashMap<>();
            // Create an array to represent the regular alphabet
            char[] alphabet = new char[26];
            int itr = 0;

            // Initialize the alphabet array with lowercase letters 'a' to 'z'
            for (char c = 'a'; c <= 'z'; ++c) {
                alphabet[c - 'a'] = c;
            }

            // Loop through the key to build the character substitution map
            for (int i = 0; i < key.length(); i++) {
                if (!temp.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                    // If the character is not already in the map and is not a space, add it to the map
                    temp.put(key.charAt(i), alphabet[itr++]);
                }
            }

            // Loop through the message to decode it using the character substitutions
            for (int j = 0; j < message.length(); j++) {
                if (message.charAt(j) == ' ') {
                    // If the character is a space, append it as is
                    sb.append(' ');
                } else {
                    // Otherwise, look up the character in the map and append the substitution
                    char result = temp.get(message.charAt(j));
                    sb.append(result);
                }
            }

            return sb.toString(); // Return the decoded message as a string
        }
    }

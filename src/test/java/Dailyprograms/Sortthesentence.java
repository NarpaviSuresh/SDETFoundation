package Dailyprograms;

public class Sortthesentence {

    public String sortSentence(String s) {
        // Split the input sentence into individual words
        String[] words = s.split(" ");

        // Create an array to store the sorted words
        String[] sortedWords = new String[words.length];

        // Reorder the words and remove the numeric suffix
        for (int i = 0; i < words.length; i++) {
            int wordIndex = Character.getNumericValue(words[i].charAt(words[i].length() - 1)) - 1;
            sortedWords[wordIndex] = words[i].substring(0, words[i].length() - 1);
        }

        // Create a StringBuilder to build the sorted sentence
        StringBuilder sb = new StringBuilder();

        // Append the sorted words to the StringBuilder with spaces
        for (int i = 0; i < sortedWords.length; i++) {
            sb.append(sortedWords[i]);
            sb.append(' ');
        }

        // Convert the StringBuilder to a string and trim any trailing space
        return sb.toString().trim();
    }
}



package Foundation;

import org.junit.Test;

import java.util.HashMap;

public class FindtheOccurenceofEachCharacter {

    /* pseudocode
    Create a HashMap to store the number of occurrences of each character in the string.
    Iterate over the string and add each character to the HashMap, incrementing the count for that character each time.
    Iterate over the HashMap and print the character and its count.
     */
    @Test
    public void test(){
        String occurence = eachOccur("I will become sDEt by Gods grace");
        System.out.println(occurence);
    }


        public String eachOccur(String s) {
            HashMap<Character,Integer> map = new HashMap<>();

            for(int i=0;i<s.length();i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            }
            return map.toString();

        }


}

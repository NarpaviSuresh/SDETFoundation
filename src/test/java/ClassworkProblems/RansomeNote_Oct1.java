package ClassworkProblems;

import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class RansomeNote_Oct1 {
    /*

    https://leetcode.com/problems/ransom-note/description/
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.


Pseudocode:
    Create the hashmap to store the frequency of eachcharcter in magazine
    Iterate over the ransom note and check if each character is present in the hash map.

     */
    @Test
    public void test(){
        boolean b = ransomNote("aa", "aab");
        System.out.println(b);
    }
    @Test
    public void test1(){
        boolean b = ransomNote("a", "b");
        System.out.println(b);
    }
    public boolean ransomNote(String ransomeNote, String magazine){
//        Create the hashmap to store the frequency of eachcharcter in magazine
        ConcurrentHashMap<Character, Integer> map = new ConcurrentHashMap<>();
//        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: magazine.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
//            Map.put(c, Map.get(c) + 1);
        }
// Iterate over the ransom note and check if each character is present in the hash map.
        for (char c : ransomeNote.toCharArray()) {
            if(!map.containsKey(c)||map.get(c)==0){
                return false;
            } else{
                map.put(c,map.get(c)-1);
            }
        }
                return true;
    }
//    HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
//    HashMap<Character, Integer> magazineMap = new HashMap<>();
//for (int i = 0; i < ransomNote.length(); i++) {
//            char c = ransomNote.charAt(i);
//            if (ransomNoteMap.containsKey(c)) {
//                ransomNoteMap.put(c, ransomNoteMap.get(c) + 1);
//            } else {
//                ransomNoteMap.put(c, 1);
//            }
//        }
// Iterate over the magazine and update the magazine hash map accordingly.
//        for (int i = 0; i < magazine.length(); i++) {
//        char c = magazine.charAt(i);
//        if (magazineMap.containsKey(c)) {
//            magazineMap.put(c, magazineMap.get(c) + 1);
//        } else {
//            magazineMap.put(c, 1);
//        }
//    }

//// Iterate over the ransom note hash map and check if each character is present in the magazine hash map and if its frequency is greater than or equal to the frequency of the character in the ransom note hash map. If it is not, then the solution returns false. Otherwise, the solution continues to the next character in the ransom note hash map.
//        for (Character c : ransomNoteMap.keySet()) {
//        if (!magazineMap.containsKey(c) || magazineMap.get(c) < ransomNoteMap.get(c)) {
//            return false;
//        }
//    }
//
//    // If we reach here, it means that all of the characters in the ransom note are present in the magazine. Therefore, the ransom note can be constructed.
//        return true;
//}

}

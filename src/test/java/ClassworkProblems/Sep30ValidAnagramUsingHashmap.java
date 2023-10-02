package ClassworkProblems;

import java.util.HashMap;
import java.util.Map;

public class Sep30ValidAnagramUsingHashmap {

    /*

    Pseudocode:



     */
    public boolean validAnagram(String s, String t){
        Map<Character, Integer> smap= new HashMap<>();
        Map<Character,Integer> tmap= new HashMap<>();
    if(s.length()==t.length()) {
        for (int i = 0; i < s.length(); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            tmap.put(t.charAt(i), tmap.getOrDefault(s.charAt(i), 0) + 1);
        }
        return smap.equals(tmap);
    }
        else
        return false;
    }
    }


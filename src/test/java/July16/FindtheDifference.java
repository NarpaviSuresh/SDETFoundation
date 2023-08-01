package July16;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class FindtheDifference {
	
	/*
	 * Input: two String
	 * output : String
	 * 
	 * Test data:
	 * Input: s = "abcd", t = "abcde"
	 * 
	 * 
	 * Pseudocode:
	 * 
	 * Declare two string
	 * Check whether characters in first string is available in Second string
	 * return the extra character in String 2
	 * 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		char actual = findTheDifference("abcd", "abcde");
		Assert.assertEquals(actual, 'e');
	}
	public static char findTheDifference(String s, String t) {
		/*  int[] count = new int[26];
        char[] S = s.toCharArray(), T = t.toCharArray();
        for(int i=0;i<S.length;i++) count[S[i]-'a']++;
        for(int i=0;i<T.length;i++) count[T[i]-'a']--;
        for(int i=0;i<26;i++) if(count[i] !=0) return (char)(i+'a');
        return '\0';
    }*/

	/* Map<Character, Integer> map = new HashMap<Character, Integer>();
     for(int i=0; i<s.length(); i++) {
         if(map.containsKey(s.charAt(i))) {
             map.put(s.charAt(i), map.get(s.charAt(i))+1);
         } else {
             map.put(s.charAt(i), 1);
         }
     }
     
     for(int i=0; i<t.length(); i++) {
         if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0) {
             return t.charAt(i);
         } else {
             map.put(t.charAt(i), map.get(t.charAt(i))-1);
         }
     }
     //ignore this return;
     return ' '; */
		
		 char ch = t.charAt(t.length()-1);
	        for(int i=0; i<s.length(); i++) {
	            ch ^= s.charAt(i);
	            ch ^= t.charAt(i);
	        }
	        return ch;
	
}
}

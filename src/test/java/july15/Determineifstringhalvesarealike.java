package july15;

import org.junit.Test;

import junit.framework.Assert;

public class Determineifstringhalvesarealike {
/*
 * 
 * Problems solved in today's session
https://leetcode.com/problems/valid-palindrome/description/
https://leetcode.com/problems/shuffle-string/description/
https://leetcode.com/problems/determine-if-string-halves-are-alike/description/ 


 * INput String
 * Output boolean
 * 
 * test data: "book"
 * 	"textbook"
 * 
 * PseudoCode:

 	 Pseudo Code:
    1) Get the String and split it into two string
    2) Str1 and Str2
    3) Str3 = {vowels}
    4) for loop to traverse from 0 to str1 length, to get the count of vowels
    5) for loop 2 to traverse from 0 to str2 length, to get the count of vowels
    6) return true or false
 */
	@Test
	
	public void test1() {
		Assert.assertEquals(true, alike("book"));
	}
	
	public void test2() {
		Assert.assertEquals(false, alike("textbook"));
	}
	public boolean alike(String input ) {
		String s1= input.substring(0, input.length()/2);
		String s2= input.substring(input.length()/2);
		s1=s1.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
		s2=s2.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
		
		return s1.length()==s2.length();
	}

}

package july15;

import org.junit.Assert;
import org.junit.Test;

public class firstpalindromeinsentence {

	@Test
	public void tst1() {
		Assert.assertEquals("ada", firstPalindrome(new String[] {"abc","car","ada","racecar","cool"}));
	}
	@Test
	public void tst2() {
		Assert.assertEquals("racecar", firstPalindrome(new String[] {"notapalindrome","racecar"}));
	}
	@Test
	public void tst3() {
		Assert.assertEquals("", firstPalindrome(new String[] {"def","ghi"}));
	}
	
	public String firstPalindrome(String[] input) {
		
		for (String word : input) {
			String rev="";
			for (int i = word.length()-1; i >=0; i--) {
				rev=rev+word.charAt(i);
				
			}
			if(rev.equals(word)) {
				return word;
			}
		}
		
		return "";
}
}

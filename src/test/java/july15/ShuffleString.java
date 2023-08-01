package july15;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {
/*
 * input: String, Integer Array
 * Output: String
 * 
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
 * 
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
 * 
 * 
 * 
 */
	
	@Test
	public void test1() {
		String actual = shuffleString("codeleet", new int[] {4,5,6,7,0,1,2,3});
		Assert.assertEquals(actual, "leetcode");
	}
	
	@Test
	public void test2() {
		String actual = shuffleString("abc", new int[] {0,1,2});
		Assert.assertEquals(actual, "abc");
	}
	
	public String shuffleString(String s, int [] indices) {
		
		String temp="";
		 for (int i = 0; i < s.length(); i++) {
			 temp=temp+s.charAt(indices[i]);
			
		}
		
		return temp;
		
	}
}
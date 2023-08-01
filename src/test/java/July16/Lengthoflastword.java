package July16;

import org.junit.Test;

import junit.framework.Assert;

public class Lengthoflastword {

	/*
	 * Input String
	 * Output Integer
	 * 
	 * Test data
	 * "Hello World"
	 * "   fly me   to   the moon  "
	 * 
	 * Pseudocode
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	public void test1() {
		int lengthofLastword = lengthofLastword("   fly me   to   the moon  ");
		Assert.assertEquals(4,lengthofLastword);
	}
	
	@Test
	public void test2() {
		int lengthofLastword = lengthofLastword("Hello World");
		Assert.assertEquals(5,lengthofLastword);
	}

	public int lengthofLastword(String input) {

		String temp = input.trim();
		String res = "";
		for (int i = temp.length() - 1; i >= 0; i--) {

			if (temp.charAt(i) != ' ') {

				res = res + temp.charAt(i);

			}else {
				break;
			}
		}
		 

		return res.length();
	}
}

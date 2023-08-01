package July16;

import org.junit.Test;

import junit.framework.Assert;

public class Checkifallasappearsbeforeallbs {
/*
 * Input String
 * Output boolean
 * 
 * Test data
 * s = "aaabbb"
 * 
 * 
 * Pseudocode:
 * 
 * Declare the String
 * Check the string contains ba if yes return true else false
 * 
 * 
 */
	@Test
	public void test1() {
		boolean actual = allAB("bbb");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
		boolean actual = allAB("abab");
		Assert.assertEquals(false, actual);
	}
	@Test
	public void test3() {
		boolean actual = allAB("aaabbb");
		Assert.assertEquals(true, actual);
	}
	
	public boolean allAB(String input) {
		
		if(input.contains("ba")) {
		return false;
		}
		return true;
		
	}
}

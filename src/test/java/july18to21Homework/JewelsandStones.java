package july18to21Homework;

import org.junit.Test;

import junit.framework.Assert;

public class JewelsandStones {
	
	/*
	 * Input -> two String variables
	 * Output -> String
	 * 
	 * Test data
	 * 
	 * Input: jewels = "aA", stones = "aAAbbbb"
	 * 
	 * 
	 * PseudoCode:
	 * 
	 * Declare two string variables
	 * iterate the two strings usong two for loop
	 * compare the characters using characterindex of jewels with stones
	 * if it matches increase counter
	 * return counter
	 */
	
	@Test
	
	public void test1() {
		int actual = jewelsStone("aA", "aAAbbbb");
		Assert.assertEquals(actual, 3);
	}
	@Test
	public void test2() {
		int actual = jewelsStone("z", "ZZ");
		Assert.assertEquals(actual, 0);
	}
	
	
	public int jewelsStone(String jewels, String stones) {
		int count = 0;

		for (int i = 0; i < jewels.length(); i++) {

			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i)==stones.charAt(j)) {
					count++;

				}

			}

		}
		return count;

	}

}


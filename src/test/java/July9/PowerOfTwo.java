package July9;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfTwo {
/*
 * Input -integer
 * Output - Integer
 * 
 * Test data  - 16
 * 
 * PseudoCode
 
 */
	@Test
	public void test1() {
		boolean actual = power(26);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2() {
		boolean actual = power(19);
		Assert.assertEquals(false, actual);
	}

	public boolean power(int input) {
		
		if (input % 2 == 0 || input == 1) {
			return true;
		}
		return false;
	}
	
	
//	public static boolean isPowerOfTwo(int n) {
//		if (n <= 0) {
//			return false;
//		}
//
//		while (n % 2 == 0) {
//			n = n / 2;
//		}
//
//		return n == 1;
//	}


}

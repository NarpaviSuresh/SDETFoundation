package july18to21Homework;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class SecondlargestinString {
	
	/*
	 * Input String
	 * Output Integer
	 * 
	 * Test data
	 * s = "dfa12321afd"
	 * 
	 * Pseudocode:
	 * 
	 * Declare two integers firstlargest and secondlargest and keep it value as -1
	 * change the string into character array using tochararray method
	 * In for each loop check if character is digit
	 * if yes then get the numeric value of character and assign it to digit variable
	 * Then check if digit greater than first digit
	 * assign secondlargest to first largest and first largest to digit
	 * Else check if digit is greater than secondlargest and lesser than first largest
	 * the assign second largest to digit
	 * return secondargest
	 * 
	 */
	
	@Test
	public void test1() {
		int actual = secondLargestNo("dfa12321afd");
		Assert.assertEquals(2, actual);
	}
	@Test
	public void test2() {
		int actual = secondLargestNo("abc1111");
		Assert.assertEquals(-1, actual);
	}
	
	
	public int secondLargestNo(String s) {

		int firstLargest = -1;
		int secondLargest = -1;

		char[] charArray = s.toCharArray();

		for (char c : charArray) {

			if (Character.isDigit(c)) {
				int digit = Character.getNumericValue(c);
				System.out.println(digit);
				if (digit > firstLargest) {
					secondLargest = firstLargest;
					firstLargest = digit;
				} else if (digit > secondLargest && digit < firstLargest) {

					secondLargest = digit;
				}
			}

		}

		return secondLargest;

	}
}

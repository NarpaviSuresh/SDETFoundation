package july18to21Homework;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum69 {
/*
 * You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

Example 1:

Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.
 */
	
	
	@Test
	public void test1() {
		int actual = maximum69(9669);
		Assert.assertEquals(9969, actual);
	}
	
	@Test
	public void test2() {
		int actual = maximum69(9999);
		Assert.assertEquals(9999, actual);
	}
	@Test
	public void test3() {
		int actual = maximum69(9966);
		System.out.println(actual);
//		Assert.assertEquals(9969, actual);
	}
public int maximum69(int n) {
	String num = Integer.toString(n);
	 char[] charArray = num.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		
		if(charArray[i]=='6') {
			charArray[i] = '9';
			break;
		}
			
	}
	return Integer.valueOf(String.valueOf(charArray));

	}
}

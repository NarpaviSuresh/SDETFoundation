package homework;



import org.junit.Test;

import junit.framework.Assert;

public class AddDigits {

	/*
	 * Problem Statement https://leetcode.com/problems/add-digits/description/ Given
	 * an integer num, repeatedly add all its digits until the result has only one
	 * digit, and return it. Input: num = 38 Output: 2 Explanation: The process is
	 * 38 --> 3 + 8 --> 11 11 --> 1 + 1 --> 2 Since 2 has only one digit, return it.
	 * 
	 * Input: Integer Output: Integer
	 */

	/*PseudoCode:
	 * Declare the integer variable sum=0, num;
	 * While sum==0
	 * while num>0;
	 * Find the remainder by using the modulo (%) operator. It gives the last digit of the number (Num).
	 * Add the last digit to the variable sum.
	 * Divide the number (Num) by 10. It removes the last digit of the number.
	 * out side inner while loop, check if sum > 10
	 *yes -> assign sum to num; and sum=0;
	 *  return sum
	 * }
	 */
	
	
	public int addDigits(int num) {
		int sum = 0;
		while(sum==0) {
		while (num>0){
		sum=sum+num%10;
		System.out.println(num);
		num=num/10;
		System.out.println(num);
		}
		if (sum>10) {
			num=sum;
			sum=0;
		}
		}
		return sum;
		
	}

	@Test
	public void test1() {
		Assert.assertEquals(2, addDigits(38));
	}
	@Test
	public void test3()
	{
		Assert.assertEquals(3,addDigits(6789) );
	}
//	@Test
//	public void test2()
//	{
//		Assert.assertEquals(0,addDigits(0) );
//	}
	

}

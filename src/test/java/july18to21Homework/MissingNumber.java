package july18to21Homework;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumber {

	/*
	 * input : integer array
	 * output; integer
	 * 
	 * test data
	 * { 3, 0, 1 }
	 * {9,6,4,2,3,5,7,0,1}
	 * 
	 * Pseudocode:
	 * 
	 * Declare the integer array
	 * Declare variable num
	 * find the length of integer array and store in len variable
	 * iterate over the array and check if Integer array element is not equals to loop element
	 * if yes -> assign loop value to num 
	 * 
	 * return num
	 * 
	 * 
	 */
	@Test
	public void test1() {
		int missingNumber = missingNumber(new int[] { 3, 0, 1 });
		Assert.assertEquals(2, missingNumber);
	}
	@Test
	public void test2() {
		int missingNumber = missingNumber(new int[] {0,1});
		Assert.assertEquals(0, missingNumber);
	}
	@Test
	public void test3() {
		int missingNumber = missingNumber(new int[] {9,6,4,2,3,5,7,0,1});
		Assert.assertEquals(8, missingNumber);
		
	}
	public int missingNumber(int[] input) {

		int num = 0;
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			if (input[i] != i) {
				num = i;
			}
			
			System.out.println(num);
		}
		return num;
	}
}

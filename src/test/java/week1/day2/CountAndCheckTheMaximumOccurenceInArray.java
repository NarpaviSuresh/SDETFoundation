package week1.day2;

import org.junit.Test;

import junit.framework.Assert;

public class CountAndCheckTheMaximumOccurenceInArray {

	/*
	 * Input: ------- Integer array and int
	 * 
	 * Output: ---------- Integer
	 * 
	 * Test data: positive int []={1,2,3,4,4,4,5,6}; int a=4 negative
	 * int[]={1,2,3,4,4,4,5,6}; int a=9
	 * 
	 * Pseudocode: 1)Declare the int array and int variable 2) find the length of
	 * array 3) Declare the for loop and traverse through array 4) Check the
	 * condition to compare each index of the array and targeted value 5) if it is
	 * matches declare one count variable and increase the value 5) return count
	 */
	// positive
	@Test
	public void test1() {
		int occurence = occurence(new int[] { 1, 2, 3, 4, 4, 4, 5, 6 }, 4);
		Assert.assertEquals(occurence, 3);
	}

	// negative
	@Test
	public void test2() {
		int occurence = occurence(new int[] { 1, 2, 3, 4, 4, 4, 5, 6 }, 9);
		Assert.assertEquals(occurence, 0);
	}

	public static int occurence(int[] num, int b) {

		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == b) {
				count++;
			}

		}

		return count;

	}
}

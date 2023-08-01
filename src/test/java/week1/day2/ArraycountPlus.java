package week1.day2;

import org.junit.Test;

public class ArraycountPlus {

/*Problem statement: Add the array +1 and print the same in array format
 * 
 * input : int[]
 * o/p: int[]
 * 
 * test data: {1,2,5}
 * 
 * Pseudocode:
 * 
 * Declare the Integer array
 * Convert the array into integer
 * add 1 to integer and store it in variable
 * convert the integer into array
 * 
 * Declare the Integer array
 * Add the 1 to last index of array value
 * print the array
 * 
 */
	@Test
	public void test1() {
		
		int[] arrayPlus = arrayPlus(new int[] {1,2,3});
		
	}
	
	public int[] arrayPlus(int[] num) {
		
//		int[] test = {1,2,3};
		for (int i = num.length-1; i >=0; i--) {
			
			num[i]++;
			System.out.println(num);
		}
		

		return num;
		
	}
}

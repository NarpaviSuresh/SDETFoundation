package July9;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
	
	/*
	 * https://leetcode.com/problems/two-sum/description/
	 * 
	 * Input: Integer array
	 * 
	 * Output Integer array
	 * 
	 * Test data: [2,7,11,15]
	 * 
	 * Pseudo code:
	 * 
	 * 1) Initialize the integer array num and variable target
	 * 2) iterate num array 
	 * 3) Traverse through the entire array from  0 < then array length.
	 * 4) if sum of a[i] +a[i+1] = = target
	 * 			return arrayPosition
	 */
	
	@Test
	public void test1() {
		int[] actual = twoSum(new int[] {2,6,9,1}, 3);
		 Assert.assertEquals(new int[] {0,3}, actual);
	}

	public int[] twoSum(int [] num, int output) {
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if((num[i]+num[j])==output) {
					return new int[] {i,j};
						
				}
				
			}
			
		}
		
		return new int[] {-1,-1};
		
	}
}

package homework;

import java.util.Arrays;

import org.junit.Test;
import org.testng.AssertJUnit;

public class SquareOfSortedArray {
	
	@Test
	public void test1() {
		int [] actual=new int [] {0, 1, 9, 16, 100};
		AssertJUnit.assertArrayEquals(actual, squareofsortarray(new int [] {-4,-1,0,3,10}));
	}
	
	@Test
	public void test2() {
		int [] actual=new int [] {4,9,9,49,121};
		AssertJUnit.assertArrayEquals(actual, squareofsortarray(new int [] {-7,-3,2,3,11}));
	}

	public int[]  squareofsortarray(int[] nums) {
		// TODO Auto-generated method stub
		int newarr[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newarr[i]=nums[i]*nums[i];
		}
		Arrays.sort(newarr);
		return newarr;
	}

}

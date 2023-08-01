package july18to21Homework;

import org.junit.Test;

import junit.framework.Assert;

public class FirstpivotIndex {
	
	
	@Test
	public void test1() {
		int actual = pivotIndex(new int[] {1,7,3,6,5,6});
		Assert.assertEquals(3, actual);
	}
	@Test
	public void test2() {
		int actual = pivotIndex(new int[] {1,2,3});
		Assert.assertEquals(-1, actual);
	}
	@Test
	public void test3() {
		int actual = pivotIndex(new int[] {2,1,-1});
		Assert.assertEquals(0, actual);
	}
	
	public int pivotIndex(int[] nums) {
		
		int sum=0;
		for (int num : nums) {
			sum+=num;
		}
		int lefSum=0, rightSum=sum;
		
		for (int i = 0; i < nums.length; i++) {
			rightSum-=nums[i];
			if(lefSum==rightSum) {
				return i;
			}
			lefSum+=nums[i];
		}
		
		return -1;
		
	}
}

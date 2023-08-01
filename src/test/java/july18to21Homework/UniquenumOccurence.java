package july18to21Homework;

import org.junit.Test;

import junit.framework.Assert;

public class UniquenumOccurence {
	
	
	@Test
	public void test1() {
		boolean uniqueNumberOccurence = uniqueNumberOccurence(new int[] {1,2,2,1,1,3});
		Assert.assertEquals(true, uniqueNumberOccurence);
	}
	
	@Test
	public void test2() {
		boolean uniqueNumberOccurence = uniqueNumberOccurence(new int[] {1,2});
		Assert.assertEquals(false, uniqueNumberOccurence);
	}
	
	public boolean uniqueNumberOccurence(int[] num) {

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] == num[j]) {
					return true;
				}

			}
		}

		return false;

	}

}

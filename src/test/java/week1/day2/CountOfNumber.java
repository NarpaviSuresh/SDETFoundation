package week1.day2;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfNumber {

	/* PSEUDO CODE
	 * 
	 * INPUT INTEGER ARRAY
	 * OUTPUT  - INTEGER
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void test() {
		int[] input= {0,0,0,1,1,1,1};
		int count = countNumber(input);
		System.out.println(count);
		Assert.assertEquals(2, count);
	}
	
	public int countNumber(int[] input) {
		
		int count=0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]==1) {
				count++;
			}
		}
		
		return count;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


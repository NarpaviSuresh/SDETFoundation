package week1.day2;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfPrimeNO {
	/*
	 * input - integer output - integer
	 * 
	 * PSEUDOCODE
	 * 
	 * DECLARE THE VARIABLE NUM AND ASSIGN VALUE Declare while loop > num declare
	 * for loop and traverse till num length if (num[i]/1=num[i] && num[i]/num[i]/1)
	 * print num[i] return num[i]
	 *
	 * 
	 *
	 * 
	 */
	@Test
	public void test1() {
		int num1 = 100;
		int count=countOfPrime(num1);
		System.out.println(count);
		
	}

	public int countOfPrime(int num1) {

		int count=0;
		
			for (int i = 2; i <= num1; i++) {

				if (i / 1 == i && i / i == 1) {
					count++;
					
				}
				
			}
		
		return count;

	}

}

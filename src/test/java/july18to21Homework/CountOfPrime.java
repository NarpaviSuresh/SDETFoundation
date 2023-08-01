package july18to21Homework;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfPrime {
	
	@Test
	public void test1() {
		int prime = countPrime(100);
		Assert.assertEquals(25, prime);
	}
	
	@Test
	public void test2() {
		int prime = countPrime(10);
		Assert.assertEquals(4, prime);
	}
	@Test
	public void test3() {
		int prime = countPrime(0);
		Assert.assertEquals(0, prime);
	}
	
	@Test
	public void test4() {
		int prime = countPrime(1);
		Assert.assertEquals(0, prime);
	}
	
	public int checkPrime(int n) {
		
		for (int i = 2; i < n/2; i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
		
	}	

	
	public int countPrime(int n) {
		int count=0;
		for (int i = 3; i < n; i++) {
			if(checkPrime(i)==1) {
				count++;
			}
			
		}
		
		return count;
		
	}

}

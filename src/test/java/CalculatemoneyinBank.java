package Dailyprograms;

import org.junit.Test;

public class CalculatemoneyinBank {
//	https://leetcode.com/problems/calculate-money-in-leetcode-bank/
	
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		int totalMoney = totalMoney(6);
		System.out.println(totalMoney);
	}
	
	public int totalMoney(int n) {
		int total=0;
		int start=0;
		int curr = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i%7==1) {
				start++;
				total =total+start;
				curr= start;
				
			}
			else {
				curr++;
				total+=curr;
				
			}
		}
		
		
		return total;
		
	}
}

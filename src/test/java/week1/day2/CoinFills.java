package week1.day2;

import org.junit.Test;

import junit.framework.Assert;

public class CoinFills {

	/*
	 * PseudoCode:
     1) Input - N of coins, remaining = n;
     //  n = 5, remaining = n, row = 0;
     2) For loop to traverse from i <= 5
     3) remaining = remaining - i
     //  remaining = 5 - 1;  ==> 4
     //  remaining = 4 - 2   ==> 2
     //  row++
     4) if (remaining < 0)
        {
        break;
        }
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		int coinfills = coinfills(11);
		Assert.assertEquals(coinfills, 4);
	}
	
	@Test
	public void test2() {
		int coinfills = coinfills(6);
		Assert.assertEquals(coinfills, 3);
	}
	
	//solution 1
	public int coinfills(int coins) {
		
		int row=1;
		while(coins>0) {
			row++;
			coins=coins-row;
			
		}
		return row-1;
		
	}

	//solution 2
//	public int coinfills(int coins) {
//
//		int count = 0;
//
//		for (int i = 1; i <= coins; i++) {
//
//			int remaining = coins - i;
//			coins = remaining;
//			count = count + 1;
//			if (coins < 0) {
//				break;
//			}
//		}
//
//		return count;
//
//	}
//	
}

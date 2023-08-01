package week1.day2;

import org.junit.Assert;
import org.junit.Test;

public class StockBuySell {

	/*
	 * INPUT Int[] OUTPUT Integer
	 * 
	 * 
	 * TEST DATA +ve: I/P price={1,2,4,5,6} O/P 5
	 * 
	 * -ve: I/P price ={} O/P 0
	 * 
	 * +ve: I/P price ={7,4,3,2,5,1} O/P 3
	 * 
	 * 
	 * Pseudocode 1 Initialize the var maxprofit=0 & Currentprofit=0 2 Initialize
	 * the buy variable with Max int value 3 Iterate through the prices array 4 if
	 * the current stock price is less than buy value assign it to buy variable 5
	 * Subtract the buy price from the current stock price to get the current profit
	 * 6 Compare the max profit with current profit if max profit is less than
	 * current profit assign current to maxprofit 7 return the max profit
	 * 
	 * 
	 * 
	 */
	@Test
	public void test1() {
		Assert.assertEquals(5, maxProfit(new int[] { 1, 2, 4, 5, 6 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(3, maxProfit(new int[] { 7, 4, 3, 2, 5, 1 }));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, maxProfit(new int[] {}));
	}

//	public int stockMaxProfit(int[] price)
//	{
//		int profit=0;
//		for (int i = 0; i < price.length-1; i++) {
//			for (int j = i+1; j < price.length; j++) {
//				if(price[j]>price[i])
//					if(profit<price[j]-price[i])
//						profit =price[j]-price[i];
//			}
//		}
//		return profit;
//	}

	public int maxProfit(int[] prices) {

		int maxProfit = 0;
		int currentProfit = 0;
		int buyPrice = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < buyPrice) {
				buyPrice = prices[i];
			}
			currentProfit = prices[i] - buyPrice;
			if (maxProfit < currentProfit) {
				maxProfit = currentProfit;

			}

		}

		return maxProfit;

	}
}

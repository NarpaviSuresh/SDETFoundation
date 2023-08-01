package homework;

import org.junit.Test;

import junit.framework.Assert;

public class Climbingstairs {
	 /*
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways
    can you climb to the top?
    Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
    Example 2:
        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
     */

     /* Pseudo Code:
        -  Distinct ways to climb one step is 1 way
        -  Distinct ways to climb two-step is 2 way
        -  return n if value given is <=2
        -  create an array DS[] with n+1 length to calculate the ith step
        -  For loop to traverse from 3 to n as we know the distinct steps for 1 and 2
        -  DS[i] = DS[i-1]+ DS[i-2]
        -  Return DS[n]
     */
	
	
	@Test
	public void test1() {
		int actual = climbStairs(5);
		Assert.assertEquals(actual, 8);
	}
	
	@Test
	public void test2() {
		int actual = climbStairs(10);
		Assert.assertEquals(actual, 89);
	}
	
		public int climbStairs(int n) {

			int i;
			if (n <= 2) {
				return n;
			} else {
				int[] DP = new int[n + 1];
				DP[1] = 1;
				DP[2] = 2;
				for (i = 3; i <= n; i++) {
					DP[i] = DP[i - 1] + DP[i - 2];

				}
				return DP[n];
			}

		}
	}


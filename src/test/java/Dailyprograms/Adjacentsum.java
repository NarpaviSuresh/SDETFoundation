package Dailyprograms;

import org.junit.Test;

public class Adjacentsum {
	
	@Test
	public void test1() {
		// TODO Auto-generated method stub
		int result = adjacentSum(564);
		System.out.println(result);
		
	}
	
	
public int adjacentSum(int n) {
	
	int ans=0;
	int sign=1;
	String number = String.valueOf(n);
	char[] ch = number.toCharArray();
	for (char c : ch) {
		int x = c - '0';
		ans = ans + sign*x;
		sign= sign * -1;
		
	}
	return ans;
	
}

}

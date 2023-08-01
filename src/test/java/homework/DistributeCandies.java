package homework;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class DistributeCandies {
	
	@Test
	public void test1() {
		org.junit.Assert.assertEquals(3, DistributeCandy(new int [] {1,1,2,2,3,3}));
	}
	
	@Test
	public void test2() {
		org.junit.Assert.assertEquals(2, DistributeCandy(new int [] {1,1,2,3}));
	}
	
	@Test
	public void test3() {
		org.junit.Assert.assertEquals(1, DistributeCandy(new int [] {6,6,6,6}));
	}
	
	private int DistributeCandy(int[] candytype) {
		Set<Integer> candieset=new HashSet<Integer>();
		for (int i = 0; i < candytype.length; i++) {
			candieset.add(candytype[i]);
		}
		if(candieset.size()>candytype.length/2) {
			return candytype.length/2;
		}else {
			return candieset.size();
		}
		
	}


}
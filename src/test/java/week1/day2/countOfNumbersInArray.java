package week1.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class countOfNumbersInArray {
	/*
	 * Program Explanation input : integer array int[] output: boolean true or false
	 * 
	 * test data:
	 * 
	 * int[] num = {1,1,1,3,2,2}
	 * 
	 * PSEUDOCODE:
	 * Declare the integer array
	 * Declare Map with Character and Integer
	 * check if character is 
	 * 
	 * 
	 */
	@Test
	public void negativeScenariotest1() {
		boolean uniqueValuesCount = uniqueValuesCount(new int[] {1,1,1,2,2,2,3,3});
		Assert.assertEquals(false, uniqueValuesCount);
	}
	
	@Test
	public void positiveScenariotest2() {
		boolean uniqueValuesCount = uniqueValuesCount(new int[] {1,1,2,2,2,3,3});
		Assert.assertEquals(true, uniqueValuesCount);
	}
	
	@Test
	public void edgeScenariotest3() {
		boolean uniqueValuesCount = uniqueValuesCount(new int[] {1,1,2,2,3,3});
		Assert.assertEquals(false, uniqueValuesCount);
	}
	
	public boolean uniqueValuesCount(int[] num) {
		int[] num1 = { 1, 1, 2, 2, 3, 3, };
		int count = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < num1.length; i++) {
			if (map.containsKey(num[i])) {
				count = map.get(num[i]);
				map.put(num[i], count+1);
			} else {
				map.put(num[i], 1);
			}
			
		}
	
		Set<Integer> set = new HashSet<Integer>(map.values());
		int mapSize = map.size();
		int setSize =set.size();
		if(mapSize==setSize) {
			return true;
		}
		
		return false;

	}
}

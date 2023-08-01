package july18to21Homework;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class IntersectionOfArray {

	@Test
	public void test1() {
		int[] actual = intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		Assert.assertEquals(new int[] { 4,9}, actual);
	}
	
	@Test
	public void test2() {
		int[] actual = intersection(new int[] {1,2,2,1}, new int[] {2,2});
		Assert.assertEquals(new int[] { 2}, actual);
	}
	
	public int[] intersection(int[] A, int[] B) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : A) {
			set.add(i);
		}

		HashSet<Integer> intersection = new HashSet<Integer>();

		for (int i : B) {
			if (set.contains(i)) {
				intersection.add(i);
			}
		}

		int[] result = new int[intersection.size()];
		int index = 0;
		for (int i : intersection) {
			result[index++] = i;

		}

		return result;

	}
}

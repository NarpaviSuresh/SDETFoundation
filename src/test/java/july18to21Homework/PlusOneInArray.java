	package july18to21Homework;

import org.junit.Test;
import org.testng.Assert;

public class PlusOneInArray {

	@Test
	public void test1() {
		int[] actual = plusOne(new int[] { 1, 2, 3 });
		Assert.assertEquals(new int[] { 1, 2, 4 }, actual);
	}

	public int[] plusOne(int[] num) {
		for (int i = num.length-1; i >=0; i--) {
			if (num[i] < 9) {
				num[i] = num[i] + 1;
				return num;
			}

			else {
				num[i] = 0;
				if (i == 0) {
					num = new int[num.length + 1];
					num[0] = 1;
				}
			}

		}
		return num;
	}
}
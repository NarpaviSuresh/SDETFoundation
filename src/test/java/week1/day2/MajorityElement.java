package week1.day2;
import org.junit.Test;
public class MajorityElement {

		@Test
		public void test1() {

			int[] nums = { 1, 2, 2, 2, 2, 2, 2, 3, 1, 3 };
			int findMajorityElement = findMajorityElement(nums);
			System.out.println(findMajorityElement);
		}

		@Test
		public void test2() {

			int[] nums = { 3, 3, 3 };
			int findMajorityElement = findMajorityElement(nums);
			System.out.println(findMajorityElement);
		}

		public int findMajorityElement(int[] num) {
			int count = 1;
			int n = num.length / 2;
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {

					if (num[i] == num[j]) {
						count++;
					}
				}
				if (count > n) {
					return num[i];
				}

				count = 1;
			}
			return -1;
		}

	}

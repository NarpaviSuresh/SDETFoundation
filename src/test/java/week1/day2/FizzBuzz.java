package week1.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {

	/* Input: integer array int[]
	 * Output :Integer array int[]
	 * 
	 * constrain
	 * 
	 * Pseudocode:
	 * 
	 * Declare the arraylist of String
	 * Iterate over the array using forloop
	 * declare if loop and write the logic If the number is divisible by 3 add fizz instead of number
	 * if the number is divisible by 5 add buzz instead of Number
	 * if the number is divisible by both and 3 and 5 add fizzbuzz instead of number
	 * else add i  as String
	 * return the output list
	 * 
	 * 
	 * 
	 */
	@Test
	public void test1() {
		List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz"});
		Assert.assertEquals(expected, fizzbuzz(3));
	}
	
	public void test2() {
		List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"});
		Assert.assertEquals(expected, fizzbuzz(15));
	}
	public List<String> fizzbuzz(int input) {
		List<String> output = new ArrayList<String>();
		
		for (int i = 1; i <= input; i++) {

			if (i % 3 == 0) {
				output.add("Fizz");
			} else if (i % 5 == 0) {
				output.add("Buzz");
			}else if ((i % 3 == 0) && (i % 5 == 0)) {
				output.add("FizzBuzz");
			} 
			else {
				output.add(Integer.toString(i));
			}

		}

		return output;
	}
	
}

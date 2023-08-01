package july15;

import org.junit.Test;

import junit.framework.Assert;

public class PalindromeString {
/*
 * Input: String
 * Output: String
 * 
 * Test data: "A man, a plan, a canal: Panama"
 * 				"race a car"
 * 				" "
 * 
 * PSeudocode:
 * 
 * Step1: Declare the string
 * Step2: Remove the special and non Alpha numeric characters
 * Step3: Convert all upper case into lower case
 * Step4: iterate the string in reverse
 * Step5: compare string1 with string 2
 * Step6: if matches return true else false
 * 
 */
@Test

public void test1() {
	boolean actual = Palindrome("A man, a plan, a canal: Panama");
	Assert.assertEquals(actual, true);
}

@Test

public void test2() {
	boolean actual = Palindrome("race a car");
	Assert.assertEquals(actual, false);
}

@Test

public void test3() {
	boolean actual = Palindrome(" ");
	Assert.assertEquals(actual, true);
}

public boolean Palindrome(String input) {

	String str = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	String original = str;
	String rev = "";
	for (int i = str.length() - 1; i >= 0; i--) {
		rev = rev + str.charAt(i);

	}

	return original.equals(rev);

	/* another solution
	input = input.replaceAll("[^a-zA-Z0-9]", "");
	input = input.toLowerCase();
	StringBuilder builder = new StringBuilder(input);
	builder.reverse();
	return input.equals(builder.toString());
	 */
}
}

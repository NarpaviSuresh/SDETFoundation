package july18to21Homework;

import org.junit.Test;

import junit.framework.Assert;

public class ReplacedigitswithCharacter {
	
	
	@Test
	public void test1() {
		String replaceDigits = replaceDigits("a1c1e1");
		Assert.assertEquals("abcdef",replaceDigits);
	}
	
	@Test
	public void test2() {
		String replaceDigits = replaceDigits("a1b2c3d4e");
		Assert.assertEquals("abbdcfdhe",replaceDigits);
	}
	
	public String replaceDigits(String s) {
	 // convert into char array
    char[] arr = s.toCharArray();
    for(int i = 1; i < arr.length; i += 2) {
        // shift the char using digit
        arr[i] = (char)(arr[i-1] + arr[i]-'0');
    }
    return String.valueOf(arr);
}
}

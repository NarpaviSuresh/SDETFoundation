package July16;

import org.junit.Test;

import junit.framework.Assert;

public class NumberofSeniorCitizen {
	
	/*
	 * Input: String array
	 * Output integer
	 * 
	 * Test data Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
	 * 								{"1313579440F2036","2921522980M5644"}
	 * PseudoCode:
	 * 
	 * Declare the string, count  and assign the input
	 * iterate over the string  and assign the String [i] in any variable
	 * Get the Substring of 11 and 12 th character of String[i]
	 * convert the String array into integer store it in varibale
	 * if variable>60 increase the counter value
	 * return counter
	 * 
	 */

	@Test
	public void test1() {
		int actual = numberOfSeniorCitizen(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2() {
		int actual = numberOfSeniorCitizen(new String[] {"1313579440F2036","2921522980M5644"});
		Assert.assertEquals(0, actual);
	}
	
	
	/*public int numberOfSeniorCitizen(String [] input)
	 * for (int i = 0; i < input.length; i++) {
	 * char a =input[i].charAt(11)-'0'*10;
	 * char b=input[i].charAt(12)-'0';
	 * a.append(b);
	 * 
	 * 
	 * 
	 * 
	 */
	public int numberOfSeniorCitizen(String [] input) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			String str=input[i];
			String str1=str.substring(11, 13);
			int age = Integer.parseInt(str1);
			if(age>60) {
				count++;
			}
		}
		
		return count;			
	}
}



package week1.day2;
/*
 * input char[] array and target character
 * output char
 * constrain : get the next biggest no from target char in the given array
 * 
 * Test data :
 * 
 * Char[] input ={'a,'b','c','f','h'} // char target = 'g';
 * output h
 * Char[] input ={'a,'b','c','f'} // char target = 'g';
 * output h
 * 
 * psuedo code:
 * 
 * 1. store the given input in the char array
 * 2. store the target char in char
 * 3. iterate the array till the length of the char array
 * for(int i=0;i<=input.length-1;i++){]
 * 		int ascii =target;
 * 		if(ascii < (int)input[i]){
 * 		return input[i];
 * }
 * }return 0;
 * 
 *  
 */

import org.junit.Test;

public class NextBiggestChar {

	@Test
	public void test1() {
		char[] input = { 'a', 'b', 'c', 'f', 'h' };
		char target = 'g';
		
		char findNextBiggestChar = findNextBiggestChar(input, target);
		System.out.println(findNextBiggestChar);
	}

	public char findNextBiggestChar(char[] input, char target) {
		for (int i = 0; i <= input.length - 1; i++) {
			int ascii = target;
			if (ascii < (int) input[i]) {
				return input[i];
			}
		}
		return 0;

	}
}

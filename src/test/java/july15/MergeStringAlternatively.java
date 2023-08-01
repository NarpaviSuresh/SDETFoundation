package july15;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringAlternatively {
	

		@Test
		
		public void test1() {
			Assert.assertEquals("apbqcr",mergeStringAlternatively("abc","pqr"));
		}
		@Test
		public void test2() {
			Assert.assertEquals("apbqrs",mergeStringAlternatively("ab","pqrs"));
		}
		@Test
		public void test3() {
			Assert.assertEquals("apbqcd",mergeStringAlternatively("abcd","pq"));
		}
		
		public String mergeStringAlternatively(String word1, String word2) {
			StringBuilder output = new StringBuilder();
			int a = word1.length();
			int b = word2.length();
			int i = 0; int j = 0;
			while(i<a || j<b){
			
			if(i<a){
			output.append(word1.charAt(i++));
			}
			
			if(j<b){
			output.append(word2.charAt(j++));
			}
		}
		return output.toString();
	  }
	}



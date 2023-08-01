package Dailyprograms;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class SelfDividingNumbers {

	
	
	@Test
	public void test1() {
		List<Integer> actual = selfDividingNumber(1, 22);
		System.out.println(actual);

	}
	
	@Test
	public void test2() {
		List<Integer> actual = selfDividingNumber(47, 85);
		System.out.println(actual);

	}
	
	public List<Integer> selfDividingNumber(int left, int right){
		
		List<Integer> result = new ArrayList();
		for (int n=left; n <=right;n++) {
			
			if(selfDividing(n)) { 
				
				result.add(n);
			}
			
		}
		
		return result;
		
	}
	
	public boolean selfDividing(int n) {
		 int x=n;
		 
		 while(x>0) {
			 int d = x%10;
			 x=x/10;
			 if(d==0 || (n%d)>0) {
				 return false;
			 }
		 }
		 
		return true;
		
	}
	
	
}

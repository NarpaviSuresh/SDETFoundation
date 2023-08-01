package Dailyprograms;

import org.junit.Test;

public class DetermineTheColorOfChessBoardSquare {

	@Test
	public void test1() {
		// TODO Auto-generated method stub
		boolean status = colorOFChessBoardSquare("c8");
		System.out.println(status);
	}
	
	@Test
	public void test2() {		
		// TODO Auto-generated method stub
		boolean status = colorOFChessBoardSquare("d6");
		System.out.println(status);
	}
	
	
	public boolean colorOFChessBoardSquare(String coordinates) {
		
		
		return (coordinates.charAt(0)+coordinates.charAt(1))%2==1;
		
	}
	
	
}

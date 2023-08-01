import java.util.Arrays;

public class practiceprogram1 {

	public int missingNumber(int[] input) {
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=i) {
				return i;
			}
		}
		return input.length;
	}
	
	public static void main(String[] args) {
		

	}

}

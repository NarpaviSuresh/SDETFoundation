package MentorconnectProblems;

import org.junit.Test;

public class ReversetheString {
    /*
    input:  String
    Output: String

    Test data:
    Input: S
    Input:test -> tset
    Input: this is sample-> elpmas si siht

    Pseudoode:

    start iterate till length of the string


    */
    @Test
    public void test1(){
        String result = reverseString("test");
        System.out.println(result);
    }
    @Test
    public void test2(){
        String result = reverseString(" ");
        System.out.println(result);
    }
    @Test
    public void test3(){
        String result = reverseString("this is sample");
        System.out.println(result);
    }
    public String reverseString(String s){
        String result = "";
        if(s.equals(" ")) return null;
        for (int i = s.length()-1; i >=0; i--) {
            char c = s.charAt(i);
           result+=c;
        }
        return result;
    }
    /*  DIFFERENT APPROACHES with O[n/2]
    public static String reverseString(String s) {
  // Create two pointers, one at the beginning of the string and one at the end.
  int left = 0;
  int right = s.length() - 1;

  // While the left pointer is less than the right pointer, swap the characters at the two pointers.
  while (left < right) {
    char temp = s.charAt(left);
    s.charAt(left) = s.charAt(right);
    s.charAt(right) = temp;

    left++;
    right--;
  }

  // Return the reversed string.
  return s;
}


public static void reverseStringInPlace(char[] s) {
  // Get the middle index of the string.
  int mid = s.length / 2;

  // Iterate over the string from the beginning to the middle and swap each character with its counterpart at the other end.
  for (int i = 0; i < mid; i++) {
    char temp = s[i];
    s[i] = s[s.length - 1 - i];
    s[s.length - 1 - i] = temp;
  }
}

// Example usage:

char[] s = {'h', 'e', 'l', 'l', 'o'};

reverseStringInPlace(s);

System.out.println(new String(s)); // olleh
     */
}

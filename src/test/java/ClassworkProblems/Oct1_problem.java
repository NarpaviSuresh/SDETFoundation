package ClassworkProblems;

import org.junit.Test;

import java.util.HashSet;

public class Oct1_problem {

    @Test
    public void test() {
        boolean result = isPresent("abcdefghijklmnopqrstuvwxyz");
        System.out.println(result);
    }

    public boolean isPresent(String s) {

//        short[] arr = new short[26];
//        char[] strinarray = s.toCharArray();
//        for (int i = 0; i < s.length(); i++) {
//            char c= s.charAt(i);
//           c.
//
//
//          Given a string, validate you have all the characters of a-z
//
//    words only in lowercase and whitespace
//    return - true or false}
        HashSet<Character> set = new HashSet<>();
        for (char c = 0; c < s.length(); c++) {
            set.add(c);
        }
        if (set.size() == 26) {
            return true;
        }

        return false;
    }
}
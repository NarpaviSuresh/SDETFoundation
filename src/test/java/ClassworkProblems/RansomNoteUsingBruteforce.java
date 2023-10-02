package ClassworkProblems;

import org.junit.Test;

public class RansomNoteUsingBruteforce {

    @Test
    public void test(){
        boolean b = ransomNote("aa", "aab");
        System.out.println(b);
    }
    @Test
    public void test1(){
        boolean b = ransomNote("a", "b");
        System.out.println(b);
    }

    public boolean ransomNote(String ransomNote, String magazine){
        short[] chaArray = new short[26];
        for (int i = 0; i < magazine.length(); i++) {
            chaArray[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            chaArray[ransomNote.charAt(i) - 'a']--;
            if (chaArray[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }


        return true;

    }
}

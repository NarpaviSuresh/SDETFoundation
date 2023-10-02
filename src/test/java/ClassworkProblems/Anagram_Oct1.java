package ClassworkProblems;

import org.junit.Test;

import java.util.Arrays;

public class Anagram_Oct1 {
    /*
    pseudocode


     */
    @Test
    public void test1(){
        boolean anagram = anagram("race", "care");
        System.out.println(anagram);
    }
    
//    public boolean anagram(String a, String b){
//
//        char[] AcharArray = a.toCharArray();
//        char[] BcharArray = b.toCharArray();
//        Arrays.sort(AcharArray);
//        Arrays.sort(BcharArray);
//
//        return Arrays.equals(AcharArray,BcharArray);
//    }

   public boolean anagram(String string1, String string2){
        if(string1.length()!=string2.length()){
            return false;
        }

        int[] charcount = new int[256];

       for (int i = 0; i < string1.length(); i++) {
           charcount[string1.charAt(i)]++;
       }
       for (int i = 0; i < string2.length(); i++) {
           charcount[string2.charAt(i)]--;


           if (charcount[string2.charAt(i)] < 0) {
               return false;
           }
       }
       return true;
   }


}

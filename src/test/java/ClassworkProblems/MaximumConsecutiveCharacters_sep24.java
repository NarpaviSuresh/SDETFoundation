package ClassworkProblems;

import org.junit.Test;

public class MaximumConsecutiveCharacters_sep24 {

    /*

   intialize max Count, currentcount
   iterate over the string length
   intializwe the current count with first character
   current charcter is equal previous character
   increment current count
   else
   assign maxcount by comparing max count and currentcount
   assign currentcount=1;

     */
    /*
    > Initialize the variables left = 0 and right = 0 and maxvalue = 0
     > while loop iterate till the right < s.length()
     > if the character at left equal to character at right increment right
               replace the maxvalue if the value right minus left plus one greater than existing maxvalue
     > else reset the left pointer into right position and right pointer at right plus one postion
     > return maxvalue
     */

    @Test
    public void test1(){
        int result = consecutiveCharacters("aaabbbccceeeeeeeesfeggh");
        System.out.println(result);

    }
    public int consecutiveCharacters(String s){

//        int maxCount=0;
//        int currentCount=1;
//        // Start with the first character
//        char prevchar = s.charAt(0);
//        for (int i = 0; i < s.length()-1; i++) {
//
//            char currentchar =s.charAt(i);
//
//            if(currentchar==prevchar){
//                currentCount++; // Increment the current power if the character is the same as the previous one
//            }
//            else{
//                maxCount=Math.max(maxCount,currentCount);// Update maxPower if needed
//                currentCount=1; // Reset current power to 1 for the new character
//            }
//            prevchar=currentchar; //update the previous char
//        }
//        // Check one more time after the loop in case the maximum power extends to the end of the string
//        maxCount=Math.max(maxCount,currentCount);
//        return maxCount;

        int left=0;
        int right=0;
        int maxcount=0;
       while(right<s.length()){
           if(s.charAt(left) == s.charAt(right)){
                maxcount=Math.max(maxcount,right-left+1);
                right++;
           }
           else{
               left=right;
               right++;
           }
       }
        return maxcount;
    }
}

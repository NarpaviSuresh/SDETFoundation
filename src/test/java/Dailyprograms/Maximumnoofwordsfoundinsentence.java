package Dailyprograms;

import org.junit.Assert;
import org.junit.Test;

public class Maximumnoofwordsfoundinsentence {
    /*
    input = String array
    out put = int value

    Initialize a variable max to -1 to keep track of the maximum word count found in any sentence.
    Iterate through the array of sentences using a for loop.
    For each sentence in the array:
    Split the sentence into words using the space (" ") character as the delimiter, and store the result in an array arr.
    Check if the length of the arr array (which represents the number of words in the sentence) is greater than the current max value.
    If it is, update the max variable with the length of the arr array.
     */
    @Test
    public void test1(){
        int i = maxWords(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
        Assert.assertEquals(6,i);
    }
    public int maxWords(String[] sentences){

        int max=-1;
        for (int i = 0; i < sentences.length ; i++) {
            String arr[] = sentences[i].split(" ");

            if(arr.length > max) max= arr.length;

        }
        return max;
    }
}

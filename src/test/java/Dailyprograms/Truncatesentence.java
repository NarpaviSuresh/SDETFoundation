package Dailyprograms;

import org.junit.Test;

public class Truncatesentence {
    /*
    Input String and integer
    Output String

    Test data
    "Hello How old are you", 3
    "Hello Are you fine", 4
    " Hi there suresh here",0


        PseudoCode:
        Split the given string using split method
        Create a new String array to store the result with given int size
        iterate the String till k
        assign the words of words array into truncated array
        Join the words into sentence using join method and store it in result
        return result

     */

    @Test
    public void test1(){
        String s = truncateSentence("Hello how are you Hope you are fine then", 7);
        System.out.println(s);
    }
    @Test
    public void test2(){
        String s = truncateSentence("Hello how are you Hope you are fine then", 10);
        System.out.println(s);
    }
    @Test
    public void test3(){
        String s = truncateSentence("Hello how are you Hope you are fine then", 0);
        System.out.println(s);
    }


    public String truncateSentence(String s, int k){

        if(k==0){
            return null;
        }
        //split the sentence into words
        String[] words  = s.split(" ");

        //Creating new String array to store the values
        String[] truncated  = new String[k];

        //iterating till the K value to get the string
        for (int i = 0; i < k; i++) {
        truncated[i]=words[i];
        }
        String result = String.join(" ", truncated);
        return result;
    }
}

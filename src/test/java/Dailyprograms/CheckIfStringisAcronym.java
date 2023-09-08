package Dailyprograms;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfStringisAcronym {
    /*

    Input: List of String, String s
    Output Boolean

    Approach
    Split the string into individual words.
    Extract the first letter of each word.
    Concatenate these letters to form an acronym.
    Compare the generated acronym with the input string to check if they match.

     */
    @Test
    public void test1(){
        ArrayList<String> al = new ArrayList<>();
        al.add("if");
        al.add("you");
        al.add("know");
        al.add("what");
        al.add("i");
        al.add("mean");
        Assert.assertEquals(true, isAcronym(al,"iykwim"));
    }
    @Test
    public void test2() {
        ArrayList<String> al = new ArrayList<>();
        al.add("alice");
        al.add("bob");
        al.add("charlie");
        Assert.assertEquals(true, isAcronym(al, "abc"));
    }

    @Test
    public void test3() {
        ArrayList<String> al = new ArrayList<>();
        al.add("an");
        al.add("apple");
        Assert.assertEquals(false, isAcronym(al,"a"));
    }
    public boolean isAcronym(List<String> words, String s){
    StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {

            builder.append(words.get(i).charAt(0));
        }


        return builder.toString().equals(s);
    }
}

package Dailyprograms;

import org.junit.Test;

import java.util.HashSet;

public class Oct4_Jewelsandstones {
    /*
    https://leetcode.com/problems/jewels-and-stones/description/
    You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
    Letters are case sensitive, so "a" is considered a different type of stone from "A".

    Pseudoode:
    Create a Hashset to store jewels
    iterate the jewels using converting into char array
    add the each jewel in set
    Iterate the stones by converting char array
    check if jewelset contains stone
    if yes increase the count and return

    Time complexity O[N] = Space compleity O[n]
     */
    @Test
    public void test1(){
        int i = numJewelsandstones("ads", "abhdygd");
        System.out.println(i);
    }
    public int numJewelsandstones(String jewels, String stones){

        HashSet<Character> jewelset = new HashSet<>();

        for (char jewel: jewels.toCharArray()) {
            jewelset.add(jewel);
        }

        int jewelcount=0;
        // Count the number of jewels in the stones.
        for (char stone: stones.toCharArray()){
            if(jewelset.contains(stone)){
                jewelcount++;
            }
        }
              {

        }
        return jewelcount;
    }
}

package Dailyprograms;

import org.junit.Test;

import java.util.Arrays;

public class Heightchecker {

    /*
    https://leetcode.com/problems/height-checker/description/
    A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
    You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
    Return the number of indices where heights[i] != expected[i].

     Input: Integer array
     Output integer

     Test data:
     Input: heights = [1,1,4,2,1,3]
     Input: heights = [1,9,0,4,8,3]
     Input: heights = [1,2,3,4,5]

      Pseudocode:
      sort the integerArray
      declare the set
      iterate the array


     */

    @Test
    public void test1(){
        int i = heightChecker(new int[]{1, 9, 0, 4, 8, 3});
        System.out.println(i);
    }

    public int heightChecker(int[] heights) {
        // Sort the heights in increasing order.
        Arrays.sort(heights);
        int[] sortedHeights = new int[heights.length];
        // Initialize a counter to track the number of out-of-order heights.
        int count = 0;

        // Iterate over the heights and compare them to the sorted heights.
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) {
                count += 1;
            }
        }

        return count;
    }

}

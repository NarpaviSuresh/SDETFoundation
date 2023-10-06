package Dailyprograms;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class OCt5_Sumofuniqueelements {
    /*

    https://leetcode.com/problems/sum-of-unique-elements/description/
    You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
    Return the sum of all the unique elements of nums.

    pseudocode:
    We use two sets: uniqueElements to store unique elements and nonUniqueElements to store elements that are not unique.
    We iterate through the nums array. For each element, we check if it's not in the nonUniqueElements set. If it's not, we proceed to check whether it's in the uniqueElements set.
    If the element is in the uniqueElements set, we remove it from the uniqueElements set and add it to the nonUniqueElements set because it's no longer unique.
    If the element is not in the uniqueElements set, we add it to the uniqueElements set and add its value to the sum.
    Finally, we return the sum, which represents the sum of unique elements in the array.

    time complexity O(n) and space complexity O(n)
     */

    @Test
    public void test2(){
        int i = sumOfUnique(new int[]{1, 2, 3, 2});
        System.out.println(i);

    }
    @Test
    public void test3(){
        int i = sumOfUnique(new int[]{1, 1,1,1,1});
        System.out.println(i);

    }
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> nonunique = new HashSet<>();
        int sum=0, sum1=0;
        for (int num:nums) {
            if(!unique.contains(num)){
                unique.add(num);
                sum+=num;
                }
               else{
                   nonunique.add(num);
            }

        }
        Iterator<Integer> iterator = nonunique.iterator();
        while(iterator.hasNext()){
            sum1+= iterator.next();
        }
        return sum-sum1;
    }
}

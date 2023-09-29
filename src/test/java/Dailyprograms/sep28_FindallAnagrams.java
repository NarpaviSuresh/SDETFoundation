package Dailyprograms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sep28_FindallAnagrams {
    /*

     Pseudocode:
	 * 1) Convert String p to char[]
	 * 2) Sort the p char[]
	 * 3) Create a ArrayList
	 * 4) Iterate through the for loop (less than nd equal to -- String s minus String p length)
	 * 5) get the substring of p length
	 * 6) convert to char[] and sort
	 * 7) compare both the char[] --if equal add to arrayLsit
	 * 8) return the arrayLsit
     */
//    public List<Integer> findAnagrams(String s, String p) {
//        char[] pch = s.toCharArray();
//        Arrays.sort(pch);
//
//        int k= s.length()-p.length();
//        int n= p.length();
//
//        List<Integer> result = new ArrayList<>();
//
//        for(int i=0; i<k;i++){
//            String str = s.substring(i,i+n);
//            char[] sch = str.toCharArray();
//            Arrays.sort(sch);
//
//            if( Arrays.equals(sch,pch)){
//                result.add(i);
//            }
//        }
//        return result;
//    }
//
//
//
//    @Test
//    public void test1()
//    {
//        List<Integer> actual = findAnagrams("cbaebabacd","abc");
//        Assert.assertEquals(Arrays.asList(0,6), actual);
//    }
//
//    @Test
//    public void test2()
//    {
//        List<Integer> actual = findAnagrams("abab","ab");
//        Assert.assertEquals(Arrays.asList(0,1,2), actual);
//    }
    public List<Integer> findAnagrams(String s, String p)
    {
        //char[] sch = s.toCharArray();
        char[] pch = p.toCharArray();
        Arrays.sort(pch);
        int k = s.length()-p.length();
        int n = p.length();
        //int index=0;

        List<Integer> result = new ArrayList();
        for (int i=0; i<=k; i++)
        {
            String str = s.substring(i, i+n);
            char[] sch = str.toCharArray();
            Arrays.sort(sch);
            if (Arrays.equals(sch, pch))
            {
                result.add(i);
            }

        }
        return result;
    }

    @Test
    public void test1()
    {
        List<Integer> actual = findAnagrams("cbaebabacd","abc");
        Assert.assertEquals(Arrays.asList(0,6), actual);
    }

    @Test
    public void test2()
    {
        List<Integer> actual = findAnagrams("abab","ab");
        Assert.assertEquals(Arrays.asList(0,1,2), actual);
    }
}
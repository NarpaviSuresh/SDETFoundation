package Dailyprograms;

import org.junit.Test;

import java.util.Arrays;

public class Assigncookie {

    @Test
    public void test(){
        int contentChildren = findContentChildren(new int[]{1, 2, 3}, new int[]{1, 2});
        System.out.println(contentChildren);
    }
    @Test
    public void test1(){
        int contentChildren = findContentChildren(new int[]{1, 2}, new int[]{1,2,3,4});
        System.out.println(contentChildren);
    }
    @Test
    public void test3(){
        int contentChildren = findContentChildren(new int[]{1, 2,3,4}, new int[]{1,2,3,4});
        System.out.println(contentChildren);
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort the children's greed factor array
        Arrays.sort(s); // Sort the available cookies array

        int contentChildren = 0;
        int childIndex = 0;
        int cookieIndex = 0;

        while (childIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[childIndex]) {
                contentChildren++;
                childIndex++;
            }
            cookieIndex++;
        }

        return contentChildren;
    }
}






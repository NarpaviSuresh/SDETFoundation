package Foundation;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class CountElementsWithXPlus1 {

    @Test
    public void test1() {
        int i = countElementsWithXPlus1(new int[]{1, 2, 3});
        System.out.println(i);
    }
    public static int countElementsWithXPlus1(int[] arr) {
        int count=0;
        Set<Integer> set = new HashSet<>();
        for (int element:arr) {
            set.add(element);

        }
        for (int element:arr) {
           if(set.contains(element+1)){
               count++;

            }

        }

        return count;
    }
    }


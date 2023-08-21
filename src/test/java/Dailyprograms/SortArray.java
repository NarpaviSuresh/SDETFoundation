package Dailyprograms;

import org.junit.Test;

import java.util.Arrays;

public class SortArray {

    @Test
    public void test1() {
        String ints = Arrays.toString(arraySort(new int[]{10, 6, 9, 4, 8}));
        System.out.println(ints);

    }

    public int[] arraySort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        return arr;
    }
}

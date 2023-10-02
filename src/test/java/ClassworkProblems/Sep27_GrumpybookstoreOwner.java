package ClassworkProblems;

import org.junit.Test;


public class Sep27_GrumpybookstoreOwner {

    @Test
    public void test(){
    maxSatisfied(new int[]{1,0,1,2,1,1,7,5},new int[]{},2);
    }
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;
        int sum = 0;
        int windowSum = 0;
        int left = 0;
        int right = 0;

        while (right < customers.length) {
            // Update the window sum.
            windowSum += customers[right] * grumpy[right];

            // If the window size is greater than the maximum number of minutes,
            // remove the leftmost element from the window and update the window sum.
            if (right - left + 1 > minutes) {
                windowSum -= customers[left] * grumpy[left];
                left++;
            }

            // Update the maximum number of satisfied customers.
            max = Math.max(max, windowSum);

            right++;
        }

        // Calculate the total number of satisfied customers if the bookstore owner
        // is not grumpy.
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        return max + sum;
    }
}


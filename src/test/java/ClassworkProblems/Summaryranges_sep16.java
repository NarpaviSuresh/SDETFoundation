package ClassworkProblems;

import java.util.ArrayList;
import java.util.List;

public class Summaryranges_sep16 {

        public List<String> summaryRanges(int[] nums) {
            List<String> result = new ArrayList<>();

            // Initialize two pointers, 'start' and 'end', to keep track of the current range.
            int start = 0;
            int end = 0;

            // Loop through the input 'nums' array.
            while (end < nums.length) {
                // Check if the current element is consecutive to the previous element.
                if (end + 1 < nums.length && nums[end + 1] == nums[end] + 1) {
                    end++;  // Expand the range by moving the 'end' pointer.
                } else {
                    // If the current element is not consecutive, we have found the end of a range.
                    if (start == end) {
                        // If 'start' and 'end' are the same, add a single element to the result.
                        result.add(Integer.toString(nums[start]));
                    } else {
                        // If 'start' and 'end' are different, add a range to the result.
                        result.add(nums[start] + "->" + nums[end]);
                    }
                    // Update 'start' and 'end' pointers for the next range.
                    start = end + 1;
                    end = start;
                }
            }

            return result;
        }



}

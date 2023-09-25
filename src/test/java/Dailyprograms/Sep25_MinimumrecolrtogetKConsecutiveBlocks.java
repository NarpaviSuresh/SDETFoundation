package Dailyprograms;

import org.junit.Test;

public class Sep25_MinimumrecolrtogetKConsecutiveBlocks {

    /*
    PSEUDOCODE
    We iterate through the string blocks, treating each position as a potential center for consecutive black blocks.

    For each potential center, we initialize left and right pointers for expanding.

    We expand to the left and right, counting the number of white blocks ('W') and storing it in the variable ops.

    We check if the expanded substring contains at least k consecutive black blocks (i.e., right - left - 1 >= k). If it does, we update minOps with the minimum number of operations needed.

    Finally, we check if minOps is still Integer.MAX_VALUE. If it is, it means no consecutive black blocks were found in the entire string, so return 0. Otherwise, return minOps + k, as you need to add k operations to convert the found consecutive black blocks to white.
     */
    @Test
    public void test1(){
        int result = Sep25_minimumrecolrtogetKConsecutiveBlocks("WBBWWBBWBW", 7);
        System.out.println(result);
    }
    public int Sep25_minimumrecolrtogetKConsecutiveBlocks(String blocks, int k){

        int n = blocks.length();
        int minOps = Integer.MAX_VALUE;

        for (int center = 0; center < n; center++) {
            // Initialize left and right pointers for expanding
            int left = center;
            int right = center;
            int ops = 0;

            // Keep expanding to the left as long as the block is 'W' and ops < k
            while (left >= 0 && (blocks.charAt(left) == 'W' || ops < k)) {
                if (blocks.charAt(left) == 'W') {
                    ops++;
                }
                left--;
            }

            // Keep expanding to the right as long as the block is 'W' and ops < k
            while (right < n && (blocks.charAt(right) == 'W' || ops < k)) {
                if (blocks.charAt(right) == 'W') {
                    ops++;
                }
                right++;
            }

            // Update minOps with the minimum number of operations needed
            if (right - left - 1 >= k) {
                minOps = Math.min(minOps, ops);
            }
        }

        // If minOps is still MAX_VALUE, it means no consecutive black blocks were found,
        // so return 0. Otherwise, return minOps + k, as you need to add k operations to
        // convert the found consecutive black blocks to white.
        return minOps == Integer.MAX_VALUE ? 0 : minOps + k;
    }
    }


package homework;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThree {

    /*
    Given an integer n, return true if it is a power of three. Otherwise, return false.
    An integer n is a power of three, if there exists an integer x such that n == 3x.
    Example 1:

    Input: n = 27
    Output: true
    Explanation: 27 = 33

    Example 2:
    Input: n = 0
    Output: false
    Explanation: There is no x where 3x = 0.

    Example 3:
    Input: n = -1
    Output: false
    Explanation: There is no x where 3x = (-1).

    Pseudo Code:
    - Check whether the number is > 1 (while n > 1)
    - if (n % 3== 0) then
         n = n / 3;
    - if (n == 1) return true
    - else return false
     */

    @Test
    public void test1() {
        boolean actual = powerOfThree(27);
        Assert.assertEquals(actual, true);
    }

    @Test
    public void test2() {
        boolean actual = powerOfThree(8);
        Assert.assertEquals(actual, false);
    }

    @Test
    public void test3() {
        boolean actual = powerOfThree(2);
        Assert.assertEquals(actual, false);
    }

    @Test
    public void test4() {
        boolean actual = powerOfThree(0);
        Assert.assertEquals(actual, false);
    }

    @Test
    public void test5() {
        boolean actual = powerOfThree(-1);
        Assert.assertEquals(actual, false);
    }

    public boolean powerOfThree(int n) {
        while (n > 2) {
            if (n % 3 == 0) {
                n = n / 3;
                if (n == 1)
                    return true;
            } else {
                return false;
            }
           
        }
        return false;
    }

}


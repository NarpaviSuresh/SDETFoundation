package Dailyprograms;

import org.junit.Test;

public class ThreeDivisors {
    @Test
    public void test1(){
        boolean actual = isThree(2);
        System.out.println(actual);
    }
    @Test
    public void test2(){
        boolean actual = isThree(4);
        System.out.println(actual);
    }
    public boolean isThree(int n) {
        int count = 0;
        for (int i=1;i<=n;i++) {
            if (n % i == 0){
                count++;

            }
        }
        if(count>=3){
            return true;
        }

        return false;
    }
}

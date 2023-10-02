package Foundation;

import org.junit.Test;

public class ContainsDuplicate {
        @Test
        public void test(){
            boolean b = containsDuplicate(new int[]{1,2,3,2,3});
            System.out.println(b);
        }

        @Test
    public void test1(){
        boolean b = containsDuplicate(new int[]{1,2,3});
        System.out.println(b);
    }
        public boolean containsDuplicate(int[] nums) {

            for(int i=0; i<nums.length;i++){
                for(int j=i+1; j<nums.length;j++){
                    if(nums[i]==nums[j])
                        return false;
                }
            }
            return true;
        }
    }


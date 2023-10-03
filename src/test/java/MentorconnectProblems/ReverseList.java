package MentorconnectProblems;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ReverseList {
    @Test
    public void test(){
        List<Integer> arr2 = Arrays.asList(1,2,3,4,5);
        List<List<Integer>> ranges = Arrays.asList(Arrays.asList(1,3),Arrays.asList(2,3));
        Assert.assertTrue(reverseRange(arr2,ranges).equals(Arrays.asList(1,4,2,3,5)));

    }
    private List<Integer> reverseRange(List<Integer> inputlist, List<List<Integer>> ranges){
        for (List<Integer> list:ranges){
            reverseList(inputlist,list.get(0),list.get(1));
        }

        return inputlist;
    }

    public List<Integer> reverseList(List<Integer> list,int start, int end){

        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        return list;
    }
}

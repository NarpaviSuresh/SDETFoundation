package Foundation;

import org.junit.Test;

public class UniqueOccurence {

    @Test
    public void test(){
        boolean b = uniqueOccurrences(new int[]{1, 2, 1, 2, 3, 5, 1, 2});
        System.out.println(b);
    }

    public boolean uniqueOccurrences(int[] arr) {
        int count=0;int othercount=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                 count++;
                }
                for (int k = 0; k < arr.length; k++) {
                    if(arr[j]==arr[k]){
                        othercount++;
                    }
                }
                if(i!=j && count==othercount){
                    return false;
                }
            }
        }
        return true;
    }
}

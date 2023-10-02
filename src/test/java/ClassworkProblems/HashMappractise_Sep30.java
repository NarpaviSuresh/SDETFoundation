package ClassworkProblems;

import org.junit.Test;

import java.util.HashMap;

public class HashMappractise_Sep30 {
    @Test
    public void test1(){
        HashMap<String, Integer> hash = new HashMap<>();
        hash("sizeofthearray");
        hash("Jane");
        hash("Joel");
    }
    public void hash(String key){
        int size = 16;
        int hashvalue = key.hashCode();
        int boxedvalue=hashvalue >>> 16;
        int index = (size-1) & boxedvalue;
        System.out.println(index);

    }

}

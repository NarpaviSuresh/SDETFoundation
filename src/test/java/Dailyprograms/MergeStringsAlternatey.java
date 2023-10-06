package Dailyprograms;

import org.junit.Test;

public class MergeStringsAlternatey {

    @Test
    public void test(){
        String s = mergeAlternatively("abc", "def");
        System.out.println(s);
    }
    public String mergeAlternatively(String string1, String string2){
        int diff=0;
        String substr1="";
        String substr2="";
        String append="";

        if(string1.length()>string2.length()){
            diff=string1.length()-string2.length();
            substr1=string1.substring(diff);
            for (int i = 0; i <string2.length(); i++) {
                append=append+string1.charAt(i)+string2.charAt(i);
            }
            append=append+substr1;
        }
        else{
            diff=string2.length()-string1.length();
            substr2=string2.substring(diff);
            for (int i = 0; i < string1.length(); i++) {
                append=append+ string1.charAt(i)+string2.charAt(i);
            }
            append=append+substr2;
        }
        return append;
    }

}

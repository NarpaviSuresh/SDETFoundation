package ClassworkProblems;

import org.junit.Test;

public class ReverseTheString_sep16 {
    @Test
    public void test1(){
        String result = reverseString("Suresh");
        System.out.println(result);
    }
//    public String reverseString(String s){
//        String result= " ";
//        if(s.equals(" ")) return null;
//        for (int i = s.length()-1; i >=0 ; i--) {
//            char c = s.charAt(i);
//            result+=c;
//        }
//        return result;
//    }
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int left=0;
        int right= ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;

        }
        return new String(ch);
    }
}

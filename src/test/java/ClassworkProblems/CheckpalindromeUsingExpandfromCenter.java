package ClassworkProblems;

import org.junit.Test;

public class CheckpalindromeUsingExpandfromCenter {
    @Test
    public void test1(){
        boolean radar = isValidPalindromeFromCenter("RADAR");
        System.out.println(radar);
    }
    public boolean isValidPalindromeFromCenter(String s)
    {   int start,end;
        if(s.length()%2==0)
        {
            start=s.length()/2-1;
            end=s.length()/2;

        }
        else
        {
            start=s.length()/2-1;
            end=s.length()/2+1;
        }
        s=s.toLowerCase();
        while(start>=0&&end<s.length())
        {
            if(s.charAt(start)!=s.charAt(s.length()-1-start))
            {
                return false;
            }
            start--;
            end++;
        }
        return true;
    }
}

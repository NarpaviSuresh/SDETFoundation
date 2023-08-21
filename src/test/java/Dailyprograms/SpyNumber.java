package Dailyprograms;

import org.junit.Test;

public class SpyNumber {
/*
1.Understanding the problem to detailed level (clarity on input and output, constraints)

2.Frame Test data (valid, invalid, complex and edge cases)

3.Do you know the Solution?

            4.Do you have any alternate approaches? (Thing of alternate approaches)

            5. Derive Pseudo code in paper (for the best chosen approach)
    Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!

            6. Dry run the pseudocode with all test data from step #2

            7.Write the code on notepad

8. Dry run the code with all test data from step #2

            9. Write code on IDE (remember to add comments and practice coding standards)

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE

11. Check for any gaps of code optimization (if not optimized already in Step#9)
/*
   Find if no is spy number A number whose sum of the digits of is equal
   to the product of its digits is called Spy Number

        Example
       the sum of digits = 1+3+2=6
     The product of the digits  = 1*3*2=6

        Input - Integer
         output Boolean

    test data
            1) 132
           2) 1124
*/
/*PSeudocode:
    1. get the integer as input
    2. iterate through for loop and add the each digit and store it in separate variable
    3. iterate through for loop and multiply each digit of given integer and store it in separate
    4. Compare the variableand if the value is same then return true
    5. else return false

    function isSpyNumber(number):
    Convert the number to a string to work with individual digits
    numberString = convertToString(number)

    Initialize variables to keep track of sum and product
    sumOfDigits = 0
    productOfDigits = 1

    Iterate through each digit in the number
    for digitChar in numberString:
        Convert the character back to an integer
        digit = convertToInt(digitChar)

        Update sum and product
        sumOfDigits += digit
        productOfDigits *= digit

    Check if the sum of digits is equal to the product of digits
    if sumOfDigits == productOfDigits:
        return true
    else:
        return false

Input: a number to check
inputNumber = input("Enter a number: ")
number = convertToInt(inputNumber)

Check if the number is a Spy Number
if isSpyNumber(number):
    print(number, "is a Spy Number.")
else:
    print(number, "is not a Spy Number.")
Please note that this is pseudocode and not actual code. You would need to convert this pseudocode into a programming language of your choice, like Python, Java, C++, etc. You'll need to implement the convertToString, convertToInt, and the input/output handling based on the programming language you use.
 */

@Test
    public void test1(){
    boolean b = spyNumber(123);
    System.out.println(b);
}
    @Test
    public void test2(){
        boolean b = spyNumber(1124);
        System.out.println(b);
    }
    @Test
    public void test3(){
        boolean b = spyNumber(134);
        System.out.println(b);
    }
    @Test
    public void test4(){
        boolean b = spyNumber(0);
        System.out.println(b);
    }
    public boolean spyNumber(int num){
//
        // Initialize variables to keep track of sum and product
         int sum=0;
         int product = 1;
         int digit=0;
        if(num==0){
            return false;
        }
        while(num>0){

            digit = num%10;
            sum+=digit;
            product*=digit;
            num=num/10;
        }
        if(sum==product) return true;

        return false;
    }
}

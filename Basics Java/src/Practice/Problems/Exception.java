import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        
        int a = 0, b = 0, c;
        try
        {
            a = obj.nextInt();
            b = obj.nextInt();
            try
            {
                c = a/b;
                System.out.println(c);
            }
        
            catch(ArithmeticException e)
            {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        }
         catch(Exception e)
        {
            System.out.println("java.util.InputMismatchException");
        }
    }
}

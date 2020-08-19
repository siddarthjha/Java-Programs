import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar = new int[n];
        for(int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        int counter = 0;
        for(int  i = 0; i < ar.length; i++)
        {
            for(int j = i; j < ar.length; j++)
            {
                int sum = 0;
                for(int k = i; k <= j; k++)
                {
                    sum += ar[k]; 
                }
                if(sum < 0)
                    counter++;
            }
        }
        sc.close();
        System.out.println(counter);
    }
}

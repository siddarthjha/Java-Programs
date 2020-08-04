import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for(int i=0; i<length; i++)
            {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            for(int j =0;j<n;j++) {
                System.out.print(getValue(a,b,j)+" ");
            }
            System.out.println();
        }
    }
    
    static int getValue(int a,int b, int n) {
        
        int sum = a;
        for(int z=n;z>=0;z--) {
            sum = sum + ((int) Math.pow(2,z))*b;
        }
        
        return sum;
    }
}


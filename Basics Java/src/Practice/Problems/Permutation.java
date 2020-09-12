import java.util.Scanner;
import static java.lang.System.*;

public class Permutation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		out.println("The string is " + s);
		permutation(s, 0, len);
	}
	
	public static void permutation(String str, int start, int end)  
    {  
        //Prints the permutations  
        if (start == end-1)  
            System.out.println(str);  
        else  
        {  
            for (int i = start; i < end; i++)  
            {  
                //Swapping the string by fixing a character  
                str = swapString(str,start,i);  
                //Recursively calling function generatePermutation() for rest of the characters   
                permutation(str,start+1,end);  
                //Backtracking and swapping the characters again.  
                str = swapString(str,start,i);  
            }  
        } 
	}
	
	public static String swapString(String a, int i, int j) 
	{  
        char[] b =a.toCharArray();  
        char ch;  
        ch = b[i];  
        b[i] = b[j];  
        b[j] = ch;  
        return String.valueOf(b);  
    }  
}


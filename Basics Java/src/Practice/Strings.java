/*
  TODO: Understand the concept of String.
*/  
import java.util.*;
public class Strings
{
	public static void main(String[] args)
	{
		// Strings are immutable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some input");
		String s1 = sc.nextLine();
		String s = "Siddarth";
		System.out.println(s.equalsIgnoreCase(s1));
		// StringBuffer class let's us build mutuable string.
		StringBuffer s2 = new StringBuffer("Siddarth");
		s2.insert(8," Kumar jha");
		System.out.println("StringBuffer");
		System.out.println(s2);
		// StringBuilder also does the same but it is non-synchronized.
		StringBuilder s3 = new StringBuilder("Siddarth");
		s3.append(" Kumar jha ");
		System.out.println(s3);
		System.out.println("StringBuilder");
		StringTokenizer s4 = new StringTokenizer("Hello i am Siddarth");
		while (s4.hasMoreTokens()) 
		{  
         	System.out.println(s4.nextToken());  
		}
	}
}


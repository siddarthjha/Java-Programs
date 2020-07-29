/*
  TODO: Understand concept of Exception
  
  Types of Exception:
  1. Checked Exception. (Compile time)
  2. Unchecked Exception. (Run time)
*/

public class Exceptions
{
	public static void main(String[] args) throws Exception // throws way of handling exception
	/* When you use throws there are two options
	1. No exception occurs and program run smoothly with mentioning throws.
	2. Exception occurs and you 
		1. Handle the excpetion.
		2. If not handled it will throw the exception to run-time but not handle it.
	*/
	{
		int ar[] = new int[5];
		try
		{
			for(int i = 0; i<6; i++)
			{
				ar[i] = i; // ArrayIndexOutOfBoundsException
				try // Nested try block
				{
					ar[i] = (i+1)/0;
				}
				catch(ArithmeticException e)
				{
					System.out.println("Exception is"+e.getMessage());
				}
			}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		// Multiple catch block
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundsException is "+a.getMessage());
		}
		
		finally
		{
			System.out.println("Finally block block is executed at last even if the exception is handled or not");
		}
		System.out.println("Blurrr...");
		throw new NullPointerException("Explicit way to handle exception");
	}
}

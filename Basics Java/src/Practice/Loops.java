/*
  TODO: Understand the different loops.
*/
public class Loops
{
	public static void main(String[] args)
	{
		int i = 10;
		// You can have label for loop
		// The labeling can be usefull for break in nested loop
		System.out.println("For-loop Begins");	
		aa:
			for(i = 5; i < 10; i++)
			{
				System.out.println("i="+i);
				if(i == 10)
				{
					break aa;
				}	
			}
		System.out.println("While loop Begins");
		while(i<13)
		{
			
			System.out.println("i="+i);
			i++;
		}
		System.out.println("Do-while loop begins");
		do
		{
			System.out.println("i="+i);
			i++;
		}while(i<15);
	}
}


import java.util.Scanner;
public class PascalTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PascalTriangle obj = new PascalTriangle();
		System.out.println("Enter the number");
		int a = sc.nextInt();
		obj.pascal(a);
	}
	
	public void pascal(int a)
	{
		int c;
		for(int line = 1; line <= a; line++)
		{
			c = 1;
			for(int i = 1; i <= line; i++)
			{
				System.out.print(c + " ");
				c = c * (line - i)/ i;
			}
			System.out.println();
		}
	}
}
		

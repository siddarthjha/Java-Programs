public class Arraysum
{
	public static void main(String[] args)
	{
		int a[] = {1, 6, 2, 4, 8, 9};
		int sum = 10;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[i] + a[j] == sum)
				{
					System.out.println("The pairs are :" + a[i] + " " + a[j]);
				}
			}
		}
	}
}

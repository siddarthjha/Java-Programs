public class CommonElements
{
	static int a[] = {13, 27, 35, 40, 49, 55, 59};
	static int b[] = {17, 35, 39, 40, 55, 58, 60};
	
	public static void main(String[] args)
	{
		CommonElements obj = new CommonElements();
		int len = b.length;
		System.out.println("The common elements are :");
		for(int i = 0; i < a.length; i++)
		{
			obj.binary(a[i], len);
		}
	}
	
	public void binary(int a, int last)
	{
		int s = 0;
		int mid = (s + last)/2;
		while(s <= last)
		{
			if(b[mid] < a)
			{
				s = mid +1;
			}
			else if(b[mid] == a)
			{
				System.out.print(b[mid] + " ");
				break;
			}
			else
			{
				last = mid - 1;
			}
			mid = (s + last)/2;
		}
	}
}



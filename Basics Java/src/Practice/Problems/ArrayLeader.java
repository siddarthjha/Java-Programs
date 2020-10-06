public class ArrayLeader
{
	public static void main(String[] args)
	{
		ArrayLeader obj = new ArrayLeader();
		int arr[] = {10, 4, 7, 2, 6, 3, 1};
		obj.leader(arr, arr.length);
	}
	
	public void leader(int arr[], int size)
	{
		int max = arr[size - 1];
		System.out.print(max + " ");
		for(int i = size - 2; i >=0; i--)
		{
			if(max < arr[i])
			{
				System.out.print(arr[i] + " ");
				max = arr[i];
			}
		}
	}
}
	

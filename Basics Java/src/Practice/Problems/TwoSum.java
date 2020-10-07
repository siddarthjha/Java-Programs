import java.util.*;
class TwoSum
{
	public static void main(String[] args)
	{
		int ar[] = {1, 5, 9, 7, 3, 4};
		int sum = 5;
		Map<Integer, Integer> obj = new HashMap<>();
		for(int i = 0; i < ar.length; i++)
		{
			obj.put(ar[i], i);
		}
		for(int i = 0; i < ar.length; i++)
		{
			int diff = sum - ar[i];
			if(obj.containsKey(diff) && obj.get(diff) != i)
			{
				System.out.println(i + " " + obj.get(diff));
				break;
			}
		}
	}
}

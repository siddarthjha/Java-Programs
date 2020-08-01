/*
  TODO: ArrayList
*/
import java.util.*;
public class Arraylist
{
	public static void main(String[] args)
	{
		ArrayList <String> list = new ArrayList<String>();
		list.add("Sid");//Adding object in arraylist  
		list.add("Kumar");  
		list.add("Jha");  
		list.add("Sid");  
		Iterator itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());
		}	  
		
	}
}

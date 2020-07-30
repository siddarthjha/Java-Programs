/*
  TODO: Understand concept of annonymous class.
*/
interface It
{  
 void at();  
}  

public class Annonymous
	{  
		 public static void main(String args[])
		 {  
			 It e=new It()
			 {  
			  	public void at()
			  	{
			  		System.out.println("Annonymous define");
			  	}  
			 };  
		 	 e.at();  
	     }  
	}  

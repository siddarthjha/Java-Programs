/*
  TODO: Understand concept of upcasting and downcasting.
*/
class Parent
{
	void dad()
	{
		System.out.println("I am dad function");
	}
	void m()
	{
		System.out.println("M function");
	}
}
public class Casting extends Parent
{
	void dad()
	{
		System.out.println("I am child function");
	}
	public static void main(String[] args) throws Exception
	{
		Parent obj = new Casting(); // Upcasting
		Casting obj1 = (Casting)obj; // Downcasting
		obj.dad(); 
		obj1.dad();
		obj.m();
		obj1.m();	
	}
}

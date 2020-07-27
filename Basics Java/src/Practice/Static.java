/*
  TODO: Understand the usage of static keyword.
*/
public class Static
{
	static int i = 0;
	public Static()
	{
		// Constructor
		i++;
		
	}
	static
	{
		System.out.println("Static block always get executed first");
		
	}
	static void fun()
	{
		System.out.println("I am static method");
	}
	public static void main(String[] args)        // Static here makes JVM call directly main without creating a object and avoid extra memory allocation
	{
		// this and super keywords cannot be used in static context.
		System.out.println("Then the main block gets executed");
		System.out.println("It is because static part gets memory allocated at time of loading class");
		fun();
		System.out.println("Static method does not need object refernce to call");
		Static obj = new Static(), obj1 = new Static(), obj2 = new Static();
		System.out.println("Counter for object creation i = "+i);
	}
}

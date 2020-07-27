/*
  TODO: Understand the concept of this keyword.
*/
public class This
{
	int a;
	void fun()
	{
		
		System.out.println("fun called by 'this' keyword");
		n(this);
		
	}
	public This()
	{
		System.out.println("We can call different constructor by this keyword");
	}
	public This(int a)
	{
		this();
		this.a = a;
		System.out.println("This can be used to intialize the instance variables if they have same name");
		this.fun();
	}
	void n(This obj)
	{	
		System.out.println("this can also passed as an arguement (Used in event handling)");
		System.out.println("And can also be passed to constructor");
		
	}
	
	public static void main(String args[])
	{
		This obj = new This(1);
		obj.fun();
		
	}
	
}

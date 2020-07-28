/*
  TODO: Understand the concept of remaining OOPS concept:
  1. Abstraction
  2. Interface
*/ 
interface Interface
{
	void dad();
}

interface Interface1 extends Interface // An interface extends Interface
{
	void mom();
}

abstract class Abstract 
{
	abstract void m();
	public void dada()
	{
		System.out.println("I am not an abstract method inspite being in a abstract class");
	}
	
}


public class OOPS2 extends Abstract implements Interface1
{
	public void mom()
	{
		System.out.println("I am sub-child interface method");
	}
	

	public void dad()
	{
		System.out.println("I am parent interface method ");
	}
	void m()
	{
		System.out.println("I am a abstract method, being overridden");
	}
	public static void main(String[] args)
	{
		// Abstract obj1 = new Abstract(); // We cannot instantiate an abstract class.
		OOPS2 obj = new OOPS2();
		obj.m();
		obj.dada();
		obj.dad();
		obj.mom();
	}
	
}

/*
  TODO: Understand the concept and use of super.
 "Super cannot be used from static block".
*/
class Parent
{
	int a=10;
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	void parentMethod()
	{
		System.out.println("Parent Method");
	}
}

class Child extends Parent
{
	Child()
	{
		// Implicit invoke of super method
		// super();
		System.out.println("Child Constructor");
	}
	void childMethod()
	{
		System.out.println("Super can access Parent class variable a="+super.a);
		super.parentMethod();
		// invoking parent class method
		System.out.println("Child Method");
	}
}

class Call extends Child
{
	public static void main(String[] args)
	{
		Call obj = new Call();
		// implicit invoke of super 
		// super();
		obj.callMethod();
		
		
	}
	void callMethod()
	{
		super.childMethod();
		// super can invoke parent class method
		super.parentMethod();
		System.out.println("The above one invoked Parent from call");
	}
}

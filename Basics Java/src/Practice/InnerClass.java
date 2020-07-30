/*
  TODO: Understand the concept of Inner class.
*/  
public class InnerClass
{
	class Inner
	{
		void text()
		{
			System.out.println("Hello I am inner class text");
		}
	}
	public static void main(String[] args)
	{
		InnerClass obj = new InnerClass();
		InnerClass.Inner ob = obj.new Inner();
		ob.text();
	}
}

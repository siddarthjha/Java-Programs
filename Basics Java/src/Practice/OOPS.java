/*
  TODO: Understand some OOPS concepts
*/
public class OOPS
{
	int marks;
	String subj, name; // Instance variable
	// A variable is instance variable when declared in class outside the function
	// Constructior is another way to intialize the variables.
	public OOPS()
	{
		marks = 0;
		subj = "";
		name = "";
	}
	public static void main(String args[])
	{
		OOPS obj = new OOPS();
		OOPS obj1 = new OOPS(), obj2 = new OOPS(); // Creating multiple objects
		System.out.println("Marks-"+obj.marks);
		System.out.println("Subj = "+obj.subj+"\nName: "+obj.name);
	}
	void fun(int m, String n)
	{
		marks = m;
		subj = n;
	}
}
class A
{
	public static void main(String[] args)
	{
		OOPS obj = new OOPS();
		OOPS obj1 = new OOPS();
		// A way to initialize the object
		obj.marks = 10;
		obj.marks = 100;
		obj.name = "Siddarth";
		obj1.name = "Jha";
		System.out.println("Marks: "+obj.marks);
		System.out.println("Subj: "+obj.subj+"\nName: "+obj.name);
		System.out.println("Another name: "+obj1.name);
		// Another way to initialize os bu method
		obj1.fun(95, "Compiler");
		System.out.println("Subj: "+obj1.subj+"\nMarks: "+obj1.marks);
		new OOPS().fun(10, "Anonymous object");
		// Annonymous object 		
		
	} 
}

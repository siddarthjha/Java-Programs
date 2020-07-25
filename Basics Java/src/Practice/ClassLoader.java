class B
{
  // Class name can be different than the file name if we don't use public
	public static void main(String[] args)
	{
		Class obj = B.class;
		System.out.println(obj.getClassLoader());
		// Output is java Class Loader
		//Application/System classloader will load this class  
		System.out.println(String.class.getClassLoader());
		// This will produce null because "String" is in-built class.
		//You can creaqte you own Class Loader by inheriting "ClassLoader" class.
		
	}
}

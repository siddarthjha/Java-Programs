class B
{
  // Class name can be different than the file name if we don't use public
	public static void main(String[] args)
	{
		Class obj = B.class;
		System.out.println(obj.getClassLoader());
		System.out.println(String.class.getClassLoader());
		
	}
}

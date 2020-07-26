/*
  TODO: Understand the concept of keyword "strictfp".
*/
public class Strictfp
{	
	static public void main(String[] args)
	{
		Strictfp obj = new Strictfp();
		float c = obj.add(1.254f, 2.367f);
		System.out.println(c);
	}
	strictfp float add(float a, float b) // This way the float values will not be changed even in different platforms
	{
		float c = a + b;
		return c;
		
	}
	
}

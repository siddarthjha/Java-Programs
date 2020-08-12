//import java.lang.Math;
class Comparison
{
	public static void main(String[] args)
	{
		Double x = new Double(123.456), z = new Double(123.456);
		
		Long y = new Long(123456);
		System.out.println(x == z);
		System.out.println(x.equals(y));
		System.out.println(y.equals(123456));
		Integer a = x.hashCode();
		Integer b = z.hashCode();
		System.out.println(x.hashCode());
		System.out.println(a.equals(b));
		System.out.println((int)Math.random());
	}
}

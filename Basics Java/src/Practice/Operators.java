/*

  TODO: Use of all Operators

*/
class Operators
{
	public static void main(String[] args)
	{
		
		int x = 10, y = 15;
		System.out.println("x="+ x);
		System.out.println("x++="+ x++);
		System.out.println("++x="+ ++x);
		System.out.println(x++ + ++x);
		System.out.println("~x="+ ~x);
		System.out.println(x + y);
		System.out.println(x * y);
		System.out.println(x - y);
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(x << 2);
		System.out.println(x >> 3);
		System.out.println(20 >>> 2);  // Works ">>>" same for positive numbers
		System.out.println(-20 >>> 2); // Changes parity bit (MSB) to 0
		System.out.println(x > y || x < y); // Logical Operator
		System.out.println(x < y && x < y); // Logical Operator
		System.out.println("x="+ x);
		System.out.println("y="+ y);
		System.out.println(x < y & x++ < y); // Bitwise Operator
		System.out.println(x < y | x++ < y); // Bitwise Operator
		int min = (x < y)? x:y;  // Ternary Operator
		System.out.println(min); 
		x+= 4;
		System.out.println("x="+x); // Assigment Operator 
		
	}
}


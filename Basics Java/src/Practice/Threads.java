/*
  TODO: Threads
*/

public class Threads extends Thread
{
	public void run()
	{
		System.out.println("Run is invoked by JVM after calling start()---Thread class");
		for(int i = 0; i<=5; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		Threads obj = new Threads(), obj1 = new Threads(), obj2 = new Threads();
		obj.start();
		try
		{
			//obj.join();	
			obj.join(100);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		obj1.start();
		obj2.start();
		
		
	}
}

class Threads1 implements Runnable
{
	public void run()
	{
		System.out.println("Run is invoked by JVM after calling start()---Runnable interface");
	}
	public static void main(String args[])
	{
		Threads ob = new Threads();
		Thread obj = new Thread(ob);
		obj.setDeamon(true);// Deamon thread
		obj.start();
		
	}
}




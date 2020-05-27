/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid
 */
public class Thread_5 implements Runnable
{
    public static void main(String[] args) throws Exception
    {
    Thread t1=new Thread();
    Thread t2=new Thread();
    Thread t3=new Thread();
    Thread t4=new Thread();
    Thread t5=new Thread();
    t1.setPriority(7);
    t2.setPriority(1);
    t3.setPriority(10);
    t4.setPriority(8);
    t5.setPriority(4);
    t1.sleep(2000);
    if (t1.isAlive())
    {
        System.out.println("Thread 1 is alive");
    }
else
    {
        System.out.println("Thread 1 is not alive");
    }
     t2.start();
     if (t2.isAlive())
   {
       System.out.println("Thread 2 is alive");
   }
else
{
    System.out.println("Thread 2 is not alive");
}
     t3.sleep(1000);
     if (t3.isAlive())
     {
         System.out.println("Thread 3 is alive");
     }
else
     {
         System.out.println("Thread 3 is not alive");
     }
t4.start();
if (t4.isAlive())
{
    System.out.println("Thread 4 is alive");
}

else
{
    System.out.println("Thread 4 is not alive");
}

t5.start();

if (t5.isAlive())
{
    System.out.println("Thread 5 is alive");
}

else
{
    System.out.println("Thread 5 is not alive");
}
     
    
    } 
    public void run()
    {
        
    }
}

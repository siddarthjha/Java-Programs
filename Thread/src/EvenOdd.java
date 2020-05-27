/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid
 */
import java.util.Scanner;
public class EvenOdd implements Runnable
{
    public static void main(String[] args) throws Exception
    {
        EvenOdd obj=new EvenOdd();
         EvenOdd ob=new EvenOdd();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(ob);
        t1.start();
        
        t2.start();
        
    }
     void m(int b)
    {
        System.out.println("Checks for odd numbers");
        for(int i=0;i<b;i++)
        {
            if(i%2==0);
            else
            {
                System.out.println("Number is odd-"+i);
            }
            try
           {
               Thread.sleep(100);
           }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }
            
        }
        
    }
   public synchronized void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last number to check of even and odd");
        int a=sc.nextInt();
        
        for(int i=0;i<a;i++)
        {
            if(i%2==0)
            {
                System.out.println("Number is even-"+i);
            }
           try
           {
               Thread.sleep(100);
           }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }
        }
      m(a);
        
    }
   
    
    
}

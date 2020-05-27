/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
import java.util.Scanner;
public class JoinMethod extends Thread 
{
    static int n,s;
    public static void main(String[] args) throws Exception
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Sum of First n natural numbers");
        System.out.println("Enter value of n");
        n=obj.nextInt();
        JoinMethod obj1=new JoinMethod();
        obj1.start();
        obj1.join();   //Thread.sleep(1000)
        System.out.println("Result="+s);
    }
    public void run()
    {
        System.out.println("Calculation Starts");
        for(int i=1;i<=n;i++)
        {
            s=s+i;
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Calculation Ends here....");
    }
}

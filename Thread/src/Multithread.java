/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Multithread extends Thread  //Thread is created By extending Thread class;
{
    public static void main(String[] args) throws InterruptedException
    {
        Multithread obj=new Multithread();
        obj.start();    //start() method has a pre-defined logic to execute directly to run() method
        for(int i=0;i<10;i++)
        {
            System.out.println("i:"+i);
            Thread.sleep(200);  //sleep(long millis) throws Exception waits for that much time
        }
    }
   public void run()         //run() method is being overrided
    {
        for(int j=0;j<10;j++)
        {
            System.out.println("j:"+j);
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    
}

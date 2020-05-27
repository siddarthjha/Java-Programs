/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid
 */
public class Thread_10 extends Thread
{
   static Integer count=0;
    public static void main(String[] args)
    {
        Thread_10 t1=new Thread_10();
        Thread_10 t2=new Thread_10();
        Thread_10 t3=new Thread_10();
        Thread_10 t4=new Thread_10();
        Thread_10 t5=new Thread_10();
        Thread_10 t6=new Thread_10();
        Thread_10 t7=new Thread_10();
        Thread_10 t8=new Thread_10();
        Thread_10 t9=new Thread_10();
        Thread_10 t10=new Thread_10();
        
        t1.start();
          t2.start();
            t3.start();
              t4.start();
                t5.start();
                  t6.start();
                    t7.start();
                      t8.start();
                        t9.start();
                          t10.start();
            
        
        
        System.out.print(count);

    }


    public void run() {
     synchronized(count)
     {
        System.out.println("From"+this.getName()+"  Value of count is: "+count);
        count++;
     }

//To change body of generated methods, choose Tools | Templates.
    }
    
    
   
    
    
}

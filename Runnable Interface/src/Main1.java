/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Main1 
{
    public static void main(String[] args)
    {
        Thread thread=new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Anonymous");
            }
        }
        );
        thread.start();
    }
    
}

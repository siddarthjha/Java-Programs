/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class SingleThread 
{
     void print()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("i:"+i);
        }
    }
    
    public static void main(String[] args) throws InterruptedException
    {
         SingleThread obj=new SingleThread(); 
         obj.print();
         for(int j=0;j<100;j++)
         {
             System.out.println("j:"+j);
         }
    
    }
    
}

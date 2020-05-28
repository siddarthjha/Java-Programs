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
    public static void main(String[] args)
    {
        SingleThread obj=new SingleThread();
        obj.printNumber();
        for(int j=1;j<=100;j++)
        {
            System.out.println("j"+j+"\t");
        }
    }
    void printNumber()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("i"+i+"\t");
        }
    }
    
}

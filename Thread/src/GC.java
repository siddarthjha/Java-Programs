/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class GC 
{
    GC()
    {
        System.out.println("Hello"+this);
    }
    public static void main(String[] args)
    {
        for(int i=0;i<100000;i++)
        {
        new GC();
        }
        new GC();
    }
    protected void finalize()
    {
        System.out.println("Deleted"+this);
    }
    
}

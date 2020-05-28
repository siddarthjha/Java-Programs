/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class ThrowsException extends Exception
{
    public static void main(String[] args)throws Exception
    {
        
        System.out.println("Hello");
        ThrowsException obj=new ThrowsException("siddarth");
        
    }
    ThrowsException(String name)
    {
        super(name);
        System.out.println(name);
    }
    
}

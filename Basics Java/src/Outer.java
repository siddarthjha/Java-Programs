/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Outer 
{
    static
    {
    class LocalInner
    {
       System.out.println("hello-1"); 
    } 
    }
    static
    {
        class LocalInner
        {
            System.out.println("Hello-2");
        }
    }
    
}
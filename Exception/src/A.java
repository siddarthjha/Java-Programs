/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid
 */
import java.util.*;
public class A 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter employee name");
        try
        {   
        String s=sc.nextLine();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
        System.out.println("Enter the age of Employee");
        int a=sc.nextInt();
        
        if(a>50)
        {
            System.out.println("Invalid age");
        }
        else
        {
            System.out.println("Valid age");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
       
        
    }
    
}

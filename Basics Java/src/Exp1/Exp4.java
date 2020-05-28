/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp1;

/**
 *
 * @author 500062053
 */
import java.util.*;
public class Exp4 
{
    public static void main(String[] args)
    {
        int a=0,count=0;
        
        
        for(int i=40;i<250;i++)
        {
            if(i%5==0)
            {
                a=a+i;
                count++;
            }
        }
        System.out.println("Count is"+count+"Sum is"+a);
    }
    
}

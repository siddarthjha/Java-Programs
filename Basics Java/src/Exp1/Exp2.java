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
public class Exp2 
{
    public static void main (String[] args)
    {
        int[] a=new int[5];
        int sum=0;
        System.out.println("Enter five number");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i]*a[i];
            
        }
        System.out.println("Sum of square"+sum);
        
    }
    
}

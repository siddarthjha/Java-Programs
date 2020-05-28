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
public class Exp1 
{
    public static void main(String[] args)
    {
        int[] a= new int[3];
         System.out.println("Enter three numbers");
        Scanner sc=new Scanner(System.in);
                a[0]=sc.nextInt();
                a[1]=sc.nextInt();
                a[2]=sc.nextInt();
                
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        for(int k=0;k<3;k++)
                        {
                        if(i!=j && j!=k && k!=i)
                        {
                            System.out.println(a[i]+""+a[j]+""+a[k]);
                        }
                    }
                    }
                }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Array 
{
    public static void main(String[] args)
    {
        //int arr[5];--->Error
        int arr[]=new int[5];
        arr[0]=10;   //Primitive data
        arr[1]=new Integer(2);  //Object data
        //arr[3]=34.53;--->Error
        try
        {
            arr[7]=40;     //Runtime Exception   
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Elements");
        for(int el:arr)
        {
            System.out.println(el);
        }
    }
    
}

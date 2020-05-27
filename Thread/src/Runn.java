/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Runn implements Runnable 
{
     public void run()
    {
       System.out.println("Hello");
    }
    public static void main(String[] args)
    {
       Runn o=new Runn();
       Thread obj=new Thread(o);
       obj.start();

    }
    
}

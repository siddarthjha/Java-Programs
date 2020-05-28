/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
import java.util.*;
public class TestClass 
{
    public static void main(String[] args)
    {
      System.out.println("Let's do conversions"+" "+"byte value initally is taken as 10");
      byte a=10;
      Byte b=Byte.valueOf(a);
      System.out.println("Boxing"+" - "+b);
      String c=Byte.toString(a);
      System.out.println("byte to String conversion"+" - "+c);
      byte d=Byte.parseByte(c);
      System.out.println("String to byte conversion"+" - "+d);
      byte e=b.byteValue();
      System.out.println("Unboxing"+" - "+e);
      String f=b.toString();
      System.out.println("Byte to String conversion"+" - "+f);
      Byte g=Byte.valueOf(f);
      System.out.println("String to Byte conversion "+"- "+g);
      System.out.println("All Six conversions are completed");
      
    
    
    }
    
}

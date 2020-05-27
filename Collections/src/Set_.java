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
public class Set_ 
{
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        Random r=new Random();
        HashSet s=new HashSet();
        
        for(int i=1;i<=12;i++)
        {
          int ob=r.nextInt(200);
          a.add(ob);
        }
        System.out.println("List:"+a);
        HashSet obj=new HashSet(a);
        TreeSet obj1=new TreeSet(obj);
       // HashSet obj=new HashSet(a);
       //HashSet removes the duplicates and give output
       //TreeSet makes them in Sorted order
        System.out.println("Set:"+obj);
        System.out.println("Set:"+obj1);
    }
    
}

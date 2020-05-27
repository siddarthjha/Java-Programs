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
public class Map 
{
    public static void main(String[] args)
    {
         Random r=new Random();
       String it[]={"A","B","C","D","E","F"};
      // LinkedHashMap t=new LinkedHashMap();//It maintains the order of Insertion 
       HashMap t=new HashMap(); //It doesn't maintain the order of keys and insertion
       //TreeMap t=new TreeMap();  //It maintains the order of keys
       for(int i=0;i<5;i++)
       {
           int key=r.nextInt(100);
           String  ele=it[i];
           t.put(key,ele);
       }
       System.out.println("Map:"+t);

    }
    
}

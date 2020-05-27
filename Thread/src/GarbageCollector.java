/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class GarbageCollector 
{
    GarbageCollector()
    {
        System.out.println("Created:"+this);
    }
    public static void main(String[] args) throws Exception
    {
        for(int i=0;i<10;i++)
        {
            new GarbageCollector();
            System.gc();   // gc() is called here which goes control to finalize()
            Thread.sleep(1000);
        }
        
    }
    protected void finalize()
    {
        System.out.println("Deleted"+this);   // Pre-defined to delete objects
    }
}
/*
finalize() is usually called by JVM when objects are
increased, to increase application performance
*/

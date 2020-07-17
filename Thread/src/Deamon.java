/**
 *
 * @author 500062053
 */
public class Deamon extends Thread
{
    public void run()
    {
        System.out.println("Hello");
        for(int j=0;j<10;j++)
        {
            System.out.println("J:"+j);
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                
            }
        }
        System.out.println("Run Method");
    }
    public static void main(String[] args) throws Exception
    {
        Deamon obj=new Deamon();
        obj.setDaemon(true);
        obj.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("i:"+i);
            try
            {
                Thread.sleep(100);
                
            }    
           catch(Exception e)
           {
               
           }
        }
        System.out.println("Main Method in");
    }
    
}

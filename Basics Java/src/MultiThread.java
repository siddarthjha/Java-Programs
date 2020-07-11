/**
 *
 * @author 500062053
 */
public class MultiThread extends Thread 
{
    public static void main(String[] args)
    {
        MultiThread obj=new MultiThread();
        obj.start();
        for(int j=1;j<100;j++)
        {
            System.out.println("j"+j+"\t");
        }
        
    }
   public void run()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("i"+i+"\t");
        }
    }
}

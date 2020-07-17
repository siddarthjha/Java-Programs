/**
 *
 * @author 500062053
 */
public class Main 
{
    public static void main(String[] args)
    {
        Child obj=new Child();
        Thread thread=new Thread(obj);
        thread.start();
    }
    
}

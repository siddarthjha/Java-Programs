/**
 *
 * @author 500062053
 */
public class CompMain 
{
    public static void main(String[]args)
    {
    Lenovo obj=new Lenovo()
    {
      public void fun()
      {
          System.out.println("Anonymous inner class");
      }
    };        
        obj.fun();

    }
}

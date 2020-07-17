package exception;

/**
 *
 * @author Sid
 */
import java.util.*;
public class Exception 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        float a=sc.nextInt();
        System.out.println("Enter other number to be divided");
        float b=sc.nextInt();
        try
        {
            float c=a/b;
            System.out.println(c);
        }
        catch(Throwable e)
        {
            System.out.println(e);
        }
    }
    
}

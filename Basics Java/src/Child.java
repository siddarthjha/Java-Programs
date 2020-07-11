/**
 *
 * @author 500062053
 */
public class Child
{
    
    public static void main(String[] args)
	{
		PdfDocument obj = PdfDocument();
		try
		{
			obj.load("Computer Graphics.pdf");
			// You can select your own pdf in the corresponding directory
			System.out.println("Number of pages "+obj.getPageCount());
			obj.close();
			
		}
		catch(PdfException e)
		{
			System.out.printn("Error is"+e);
		}
	}
	
    
}

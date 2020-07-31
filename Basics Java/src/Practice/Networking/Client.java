/*
  TODO: Create a client and send a meesage to server.
*/
import java.io.*;  
import java.net.*; 
public class Client 
{  
	public static void main(String[] args) 
	{  
		try
		{      
			Socket s=new Socket("localhost",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			dout.writeUTF("Hello I have connected to server via client");  
			dout.flush();  
			dout.close();  
			s.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	}  
}  

/*
  TODO: Create a Server .
*/  
import java.io.*;  
import java.net.*;  
public class Networking
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(6666);  
		Socket s = ss.accept();//establishes connection and waits for the client   
		DataInputStream dis = new DataInputStream(s.getInputStream());  
		String  str = (String)dis.readUTF();  
		System.out.println("message= "+str);  
		ss.close();    
	}
}

/*
  TODO: To understand the concept of "transient" keyword.
*/
import java.io.Serializable;
import java.io.*;
class Details implements Serializable
{
	string name,subj;
	transient int marks;
	Details(string name, string subj, int marks)
	{
		this.name = name;
		this.subj = subj;
		this.marks = marks; 
	}
}

public class Transient
{
	public static void main(String[] args)
	{
		Details s1 =new Details("Siddarth", "Compiler", 95);//creating object  
  		//writing object into file  
  		FileOutputStream f=new FileOutputStream("output.txt");  
  		ObjectOutputStream out=new ObjectOutputStream(f);  
  		out.writeObject(s1);  
  		out.flush();  
  
  		out.close();  
  		f.close();  
  		System.out.println("success");
		
	}
}

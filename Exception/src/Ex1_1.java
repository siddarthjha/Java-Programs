/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid
 */
import java.util.*;
public class Ex1_1 
{
    String name,grade;
             int reg,m1,m2,m3;
    public static void main(String[] args) 
    {
        int no=0;
Ex1_1 s=new Ex1_1();
try
{
Scanner  in= new Scanner(System.in);
System.out.println("enter the number of students : ");
no=Integer.parseInt(in.nextLine());
for(int i=0;i<no;i++);
s.read();
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("the maximum students should be ten\n");
no=10;
}
catch(Exception e)
{ System.out.println(e); }
for(int i=0;i<no;i++);
s.disp();
        
         
    }
       void read()throws Exception
        {
           
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the register no : ");
           reg=sc.nextInt();
           System.out.println("enter the name : ");
 name=sc.nextLine();
 System.out.println("enter mark1 : ");
m1=sc.nextInt();
System.out.println("enter mark2 : ");
m2=sc.nextInt();
System.out.println("enter mark3 : ");
m3=sc.nextInt();
           
        }
       public void disp_grade()
{
int tt=m1+m2+m3;
if(tt>=250) grade="A";
else if(tt>=200) grade="B";
else if(tt>=150) grade="C";
else if(tt>=100) grade="D";
else grade="E";
System.out.println("Grade :"+grade);
}
void disp()
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println(" MARK LIST OF STUDENTS ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Register No :"+reg);
System.out.println("Name :"+name);
System.out.println("Mark1 :"+m1);
System.out.println("Mark2 :"+m2);
System.out.println("Mark3 :"+m3);
disp_grade();
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */

package p;
public class New
{
    private int eno;
    private String ename;
    public New(int eno,String ename)
    {
        this.eno=eno;
        this.ename=ename;
    }
    public void setEno(int eno)
    {
        this.eno=eno;
    }
    public void setEname(String ename)
    {
        this.ename=ename;
    }
    public int getEno()
    {
        return(this.eno);
    }
    public String getEname()
    {
        return(this.ename);
    }
    public static void main(String[] args)
    {
        System.out.println("Pojo Class rules code");
        New e1=new New(10,"Siddarth");
        e1.setEno(10);
        e1.setEname("Siddarth");
        New e2=new New(11,"Sharukh");
        System.out.println(e1.getEname());
        System.out.println(e2.getEname());
        
        
    }   
}
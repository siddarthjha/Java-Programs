/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Ex2 extends Fibonacci
{
    int b;
    Ex2(int a,int b)
    {
        super(a);
        this.b=b;
    }
     void display()
    {
        
        System.out.println("a val-"+super.a);
        System.out.println("b val-"+this.b);
    }
    public static void main(String[] args)
    {
        Ex2 obj=new Ex2(10,20);
        obj.display();
    }
    
    
}

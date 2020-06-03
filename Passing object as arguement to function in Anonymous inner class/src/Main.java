/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Main 
{
    public static void main(String[] args)
    {
        Access.setLenovoObj(new Lenovo()
        {
            public void fun()
            {
                System.out.println("Anonymous passing object");
            }
        }
        );
    }
    
}

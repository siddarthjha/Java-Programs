/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */

public class Inheritance extends Parent
{
    Inheritance()
    {
        System.out.println("Child class");
    }
    public static void main(String[] args)
    {
        Inheritance obj=new Inheritance();
        System.out.println("Instantiation completed");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */
public class Overriding extends Test
{
    void videoCall()
    {
        System.out.println("Video call (Overriding)");
    }
    void camera()
    {
        System.out.println("High video call(Overriding Method)");
    }
    public static void main(String[] args)
    {
        Overriding obj=new Overriding();
        obj.call();
        obj.camera();
        obj.videoCall();
        System.out.println("Linked with Test.java");
    }
    
}

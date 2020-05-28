/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 500062053
 */

import javax.swing.*;
public class MyFrame extends JFrame
{
    static JButton b1,b2;
    MyFrame()
    {
        this.setSize(500,400);
        this.setTitle("MyFrame");
        
        b1=new JButton("Login");
        b2=new JButton("Quit");
        this.add(b1);
        this.add(b2);
        
        
    }

    
    
}

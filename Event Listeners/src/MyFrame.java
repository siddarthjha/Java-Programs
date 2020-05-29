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
import java.awt.event.*;
public class MyFrame extends JFrame
{
    static JButton b1,b2;
    MyFrame()
    {
        this.setSize(600,500);
        this.setLayout(null);
        b1=new JButton("Login");
        b1.setBounds(150, 200, 150, 50);
        this.add(b1);
        b1.addActionListener(new Button1Listener());
        b2=new JButton("Exit");
        b2.setBounds(300,200,150,50);
        this.add(b2);
        b2.addActionListener(new Button2Listener());
    }
    
        
    
    
    
}

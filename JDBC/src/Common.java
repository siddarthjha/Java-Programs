/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sid
 */
import java.lang.*;
import java.sql.*;
import java.util.*;
public class Common 
{
    public static void main(String[] args)
    {
        System.out.println("Hello we will be connecting to DB");
        try
        {
            Class.forName("Oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","siddarth","upes@123");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from emp"); 
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}

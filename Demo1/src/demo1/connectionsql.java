/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class connectionsql {
    
    public connectionsql() 
    {
     try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
     }
     catch(Exception e)
             {
                 JOptionPane.showConfirmDialog(null, "invalid connection ");
             }
    
}
    }
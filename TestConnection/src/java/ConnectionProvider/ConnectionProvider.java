/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class ConnectionProvider {
     private static Connection con;
    public static Connection getConnection() {
        
    try {
        
       if (con==null) {
           //driver class load
       
       Class.forName("com.mysql.jdbc.Driver");
        
        //create a connection
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/delivereat", "root", "admin");
        
       }
        
        
    } catch(Exception e) {
        
          e.printStackTrace();
    }
  
        
        return con;
    }
}
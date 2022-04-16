
package com.pet.adoption.DB;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;

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
        con=DriverManager.getConnection("jdbc:mysql://localhost/petadoption", "root", "admin");
        
       }
        
        
    } catch(Exception e) {
        
          e.printStackTrace();
    }
  
        
        return con;
    }
}

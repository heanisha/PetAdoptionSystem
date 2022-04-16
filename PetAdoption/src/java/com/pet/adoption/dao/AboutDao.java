/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.adoption.dao;


import com.pet.adoption.entities.About;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;


public class AboutDao {
   Connection connection = null;
    private String jdbcURL="jdbc:mysql://localhost:3306/petadoption";
    private String jdbcUsername="root";
    private String jdbcPassword="admin";  
    
    private static final String INSERT_ABOUT_SQL= "INSERT INTO about (adminId,details) VALUES " + "(?, ?);";
    private static final String SELECT_ABOUT_BY_DETAILS ="select details from about where adminId";
    private static final String SELECT_ALL_ABOUT="select * from about";
    private static final String DELETE_ABOUT_SQL="delete from about where adminId=?";
    private static final String UPDATE_ABOUT_SQL="update about set details=? where adminId=?;";
    
    public AboutDao() { }
       
     protected Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        }  catch (SQLException e) {
        e.printStackTrace();
    }catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
        return connection;
    }
    
    public void insertAbout (About about) throws SQLException {
        System.out.println(INSERT_ABOUT_SQL);
        
        try(Connection connection=getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(INSERT_ABOUT_SQL)){
        
        preparedStatement.setString(1, about.getAdminId());
        preparedStatement.setString(2, about.getDetails());
       
         preparedStatement.executeUpdate();
         
    }catch(SQLException e) {
        printSQLException(e);
    }
        
        
    } 
    
    public About selectAbout(String adminId) {
        About about = null;
        try(Connection connection=getConnection();
         
        
         
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ABOUT_BY_DETAILS);) {
        preparedStatement.setString(1, adminId);
            System.out.println(preparedStatement);
            
            ResultSet rs=preparedStatement.executeQuery();
         
        while (rs.next()) {
            String details = rs.getString("details");
           
           
            
            about= new About(adminId,details);
        }
         
        }catch(SQLException e) {
            printSQLException(e);
        } return about;
    }
    
    
     public List <About> selectAllAbout()  {
        List <About> about = new ArrayList<>();
         
        try(Connection connection= getConnection();
         
        PreparedStatement preparedStatement = 
                 connection.prepareStatement(SELECT_ALL_ABOUT);) {
         System.out.println(preparedStatement);
         
       
        ResultSet rs = preparedStatement.executeQuery();
         
        while (rs.next()) {
            String adminId = rs.getString("adminId");
            String details = rs.getString("details");
           
           
             about.add(new About(adminId,details));
            
        }
        }catch (SQLException e) {
            printSQLException (e);
        } return about;
      
    }
    
    public boolean deleteAbout(String adminId) throws SQLException {
        boolean rowDeleted;
         
        try(Connection connection= getConnection();
         
        PreparedStatement statement = connection.prepareStatement(DELETE_ABOUT_SQL); ) {
        statement.setString(1, adminId);
        rowDeleted=statement.executeUpdate() >0; 
        
                }
        return rowDeleted;
    
    }
    
     public boolean updateAbout(About about) throws SQLException {
        boolean rowUpdated;
        
         try(Connection connection = getConnection(); PreparedStatement statement=
                connection.prepareStatement(UPDATE_ABOUT_SQL);) {
             
         
       
        statement.setString(1, about.getDetails());
        statement.setString(2, about.getAdminId());
         
        rowUpdated = statement.executeUpdate() > 0;
        
         }
        return rowUpdated;
    
    
}
    

    private void printSQLException(SQLException ex) {
      for (Throwable e: ex) {
          
          if (e instanceof SQLException) {
          e.printStackTrace(System.err);
          System.err.println("SQLState: " + ((SQLException) e).getSQLState());
            System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
            System.err.println("Message: " + e.getMessage());
            Throwable t = ex.getCause();
            while(t !=null) {
                System.out.println("Cause: " + t);
                t = t.getCause();
            }
      }
      }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

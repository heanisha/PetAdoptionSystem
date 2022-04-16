package com.pet.adoption.dao;
import com.pet.adoption.entities.Admin;
import static java.lang.System.out;
import static java.lang.reflect.Array.set;
import java.sql.*;
//import static javax.servlet.jsp.jstl.core.Config.set;


/**
 *
 * @author User
 */
public class AdminDao {
    
    private Connection con;
    
    public AdminDao (Connection con) {
        this.con=con;
    }
    
    public boolean saveAdmin(Admin admin) {
        boolean f=false;
        try{
            String query="insert into admin(adminId,adminName,adminEmail,adminPhoneNo,adminPassword) values(?,?,?,?,?)";
            PreparedStatement pstmt=this.con.prepareStatement(query);
            pstmt.setString(1, admin.getAdminId());
            pstmt.setString(2, admin.getAdminName());
            pstmt.setString(3, admin.getAdminEmail());
            pstmt.setString(4, admin.getAdminPhoneNo());
            pstmt.setString(5,admin.getAdminPassword());
            
            pstmt.executeUpdate();
            f=true;
        
                    
        }catch(Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public Admin getAdminByNameAndPassword(String adminEmail, String adminPassword) {
        
        Admin admin=null;
        try{
            String query="select * from admin where adminEmail=? and adminPassword=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, adminEmail);
            pstmt.setString(2, adminPassword);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()) {
                
               admin=new Admin();
               
               String name=set.getString("adminName");
               
               admin.setAdminName(name);
               
              admin.setAdminId(set.getString("adminId"));
              admin.setAdminName(set.getString("adminName"));
              admin.setAdminEmail(set.getString("adminEmail"));
              admin.setAdminPhoneNo(set.getString("adminPhoneNo"));
              admin.setAdminPassword(set.getString("adminPassword"));
               
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return admin;
    }
    
    public boolean updateAdmin(Admin admin) {
        boolean f=false;
        
        try {
            
            String query="update admin set adminName=?, adminPhoneNo=?, adminPassword=? where adminId=?";
            PreparedStatement p=con.prepareStatement(query);
            p.setString(1, admin.getAdminName());
            p.setString(2, admin.getAdminPhoneNo());
            p.setString(3, admin.getAdminPassword());
            p.setString(4,admin.getAdminId());
            
            
            p.executeUpdate();
            f=true;
            
        }catch(Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean deleteAdmin (Admin admin) {
        boolean f=false;
        
        try{
            String query="DELETE FROM admin where adminId=?";
            PreparedStatement p=con.prepareStatement(query);
            p.setString(1,admin.getAdminId());
            
            
            p.executeUpdate();
            f=true;
        } catch(Exception e) {
            
        }
        return f;
    }
    
    
    
    
}

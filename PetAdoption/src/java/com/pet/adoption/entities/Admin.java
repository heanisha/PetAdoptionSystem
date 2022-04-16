/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.adoption.entities;

/**
 *
 * @author User
 */
public class Admin {
    private String adminId;
    private String adminName;
    private String adminEmail;
    private String adminPhoneNo;
    private String adminPassword;
    
    public Admin(){
    }

    public Admin(String adminId, String adminName, String adminEmail, String adminPhoneNo, String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPhoneNo = adminPhoneNo;
        this.adminPassword = adminPassword;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPhoneNo() {
        return adminPhoneNo;
    }

    public void setAdminPhoneNo(String adminPhoneNo) {
        this.adminPhoneNo = adminPhoneNo;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    
    
}

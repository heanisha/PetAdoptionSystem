/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.adoption.entities;

/**
 *
 * @author User
 */
public class About {
    protected String adminId;
    protected String details;


public About() {

}

    public About(String adminId, String details) {
        this.adminId = adminId;
        this.details = details;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    
    

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    
}
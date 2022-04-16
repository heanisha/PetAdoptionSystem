/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.pet.adoption.servlets;

import com.pet.adoption.dao.AboutDao;
import com.pet.adoption.entities.About;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author User
 */@MultipartConfig
     @WebServlet("/")
public class PetAdoptionServlet extends HttpServlet {

private AboutDao aboutDao;
    
    public void init() {
        aboutDao = new AboutDao();
    
    
    }
    
    @Override

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
     
        doGet(request, response);
    }
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();
 
        try {
            switch (action) {
                
            case "/newRest":
                showNewFormAbout(request, response);
                break;
         
            case "/insertAbout":
                insertAbout(request, response);
                break;
            
            case "/listAbout":
                listAbout(request, response);
                break;    
            
            case "/updateAbout":
                updateAbout(request, response);
                break;
                
             case "/editAbout":
                showEditFormAbout(request, response);
                break;
                
            case "/deleteAbout":
                deleteAbout(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
   
private void showNewFormAbout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("AboutUs.jsp");
        dispatcher.forward(request, response);
    }

 private void insertAbout(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        
        String adminId=request.getParameter("adminId");
        String details=request.getParameter("details");
        
 
        About newAbout = new About(adminId,details);
        aboutDao.insertAbout(newAbout);
        
        response.sendRedirect("listAbout");
    }

  private void listAbout(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List <About> listAbout = aboutDao.selectAllAbout();
        request.setAttribute("listAbout", listAbout);
        RequestDispatcher dispatcher = request.getRequestDispatcher("AboutList.jsp");
        dispatcher.forward(request, response);
    }

 private void updateAbout(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String adminId = request.getParameter("adminId");
        String details = request.getParameter("details");
        
        
 
         About about = new About(adminId,details);
        aboutDao.updateAbout(about);
        response.sendRedirect("listAbout");
    }
 
    private void showEditFormAbout(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String adminId = request.getParameter("adminId");
        About existingAbout = aboutDao.selectAbout(adminId);
            RequestDispatcher dispatcher = request.getRequestDispatcher("AboutUs.jsp");
        request.setAttribute("about", existingAbout);
        dispatcher.forward(request, response);
 
    }
    
    private void deleteAbout(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
         String adminId = request.getParameter("adminId");
 
        
        aboutDao.deleteAbout(adminId);
        response.sendRedirect("listAbout");
 
    }



 }
     
    

    
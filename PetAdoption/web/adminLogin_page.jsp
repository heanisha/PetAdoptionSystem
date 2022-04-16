<%-- 
    Document   : adminLogin_page.jsp
    Created on : 18 Jan 2022, 10:40:30 PM
    Author     : User
--%>

<%@page import="com.pet.adoption.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pet Adoption</title>
       <link rel="icon" href="/images/1.png""/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <!-- css -->
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background {
         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);
            }
            </style>
        
        
        
        
    </head>
    <body style="background-color:#a1ff52">
        
        <!<!-- navbar -->
        
        
        
        
          <%@include file="normal_navbar.jsp"%>
        <main class="d-flex align-items-center primary-background banner-background " style="height:90vh; "">
            
            <div class="container" >
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                      
                        <div class="card text-white" style="background-color:#1c1d1b;">
                            <div class="card-header  text-white text-center" style="background-color:purple;">
                                <span class="fa fa-user-plus fa-3x text-white" ></span>
                                    
                                <br>   
                                <p>Login here</p>
                            </div>
                            
                           <%
                             Message m=(Message)session.getAttribute("msg");  
                           if (m!=null){
                               %>
                               <div class="alert <%=m.getCssClass()%>" role="alert">
                                <%=m.getContent()%>
                                </div>
                          <%
                              session.removeAttribute("msg");
                           }

                           
                           
                           %>
                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                        
                            <div class="card-body">
                                <form action="AdminLoginServlet" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">Admin Email</label>
    <input name="adminEmail" required type="email" class="form-control" id="admin_name" aria-describedby="emailHelp" placeholder="Enter Email">
    <small id="emailHelp" class="form-text text-white">We'll never share your details with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input  name="adminPassword" required type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
   <br>
                                    <div class="container text-center">
  <button type="submit" class="btn btn-primary  text-muted" style="background-color:white">LOG IN</button>
                                    </div>
                                    
                                   
                                    <div class="mt-4">
					<div class="d-flex justify-content-center links">
                                            New at work? <a class="ml-2" href="adminRegister_Page.jsp">Sign Up</a>
</form>
                                
                            </div>
                            
                            
                        </div>
                        
                        
                        </form>

                    </div>
                    
                </div>
                </div>
        </main>

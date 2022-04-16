<%-- 
    Document   : AboutUs
    Created on : 12 Apr 2022, 10:23:50 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*, javax.servlet.*"%>




<%@page import="java.util.Enumeration"%>
<%@page import="java.sql.*"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PetAdoption</title>
        <link rel="icon" href="/images/icon.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background {
         clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 89%, 86% 96%, 11% 99%, 0 90%, 0 0);
            }
            </style>
    
        <title>JSP Page</title>
    </head>
    
 <%@include file="Adminprofile.jsp"%>
    <body style="background-color:blanchedalmond">
        
        <header>
           
        </header>
                    <br>
                    <div class="container col-md-5">
                        <div class="card">
                            <div class="card-body">
                             

                                
                                <c:if test="${about !=null}">
                                    <form action="updateAbout" method="post">
                                    </c:if>
                                        
                                    <c:if test="${about == null}">
                                    <form action="insertAbout" method="post">
                                    </c:if>
                                        
                                        <h2>
                                            <c:if test="${about != null}">
                                                Edit About
                                            </c:if> 
                                                
                                             <c:if test="${about == null}">
                                               ABOUT US
                                            </c:if> 
                                                
                                        </h2>
                                        
                                        <c:if test="${about !=null}">
                                            <fieldset class="form-group">
                                                <input type="hidden" name="adminId" value="<c:out value='${about.adminId}'/>"/><!-- comment -->                             
                                            </fieldset>
                                        </c:if>
                                        
                                        <fieldset class="form-group">
                                                <label></label>
                                                
                                                
                                        <input type="hidden" class="form-control" name="adminId" value="<%=admin.getAdminId()%>">                        
                                        </fieldset>
                                        
                                            <fieldset class="form-group">
                                                <label>Details</label><input type="text" value="<c:out value='${about.details}'/>"
                                                                                   class="form-control" name="details" required="required"><!-- comment -->                             
                                            </fieldset>
                                                                                   
                                            <p></p>                              
                                              
                                                                                   
                                             <button type="submit" class="btn btn-success">Save</button>
                                             <button type="button" class="btn btn-success"  onclick="window.location.href = 'listAbout';">View</button>
                                    
                                    </form>
                                                                                   
                            </div>
                        </div>
                    </div>
            
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>

       
    </body>
</html>

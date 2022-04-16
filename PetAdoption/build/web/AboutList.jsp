<%-- 
    Document   : AboutList
    Created on : 12 Apr 2022, 11:38:10 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<html>
    <head>
        <title>PetAdoption</title>
        <link rel="icon" href="/images/1.png""/>
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
   
        <header>
         
        </header>
                
                <br>
                 <div class="container">
                <div class="row">
                    <div class="container">
                        <h3 class="text-center">ABOUT</h3>
                        <hr>
             
                  
                    <br>
                    <table class="table table-bordered " style="border-color:black; border-width:2px;">
                        <thead style="border-color:black; border-width:2px;">
                            <tr style="border-color:black; border-width:2px;">
                                
                                <th style="border-color:black; border-width:2px;">Details</th><!-- comment -->
                                
                                
                                <th style="border-color:black; border-width:2px;">Actions</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            <c:forEach var="about" items="${listAbout}">
                                <tr>
                                    
                                    <td style="border-color:black; border-width:2px;">
                                        <c:out value="${about.details}"/>
                                    </td>
                                    
                                    
                                    
                                     
                                    
                                    <td style="border-color:black; border-width:2px;">
                                        <a href="editAbout?adminId=<c:out value='${about.adminId}'/>">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;<!-- comment -->
                                        <a href="deleteAbout?adminId=<c:out value='${about.adminId}'/>">Delete</a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                </div>
                 </div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>     
                </body>
</html>

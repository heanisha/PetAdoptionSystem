<%@page import="com.pet.adoption.entities.Admin"%>
<%@page errorPage="error_page.jsp"%>
<%
    


Admin admin=(Admin)session.getAttribute("currentUser");

if (admin==null){
    response.sendRedirect("adminLogin_page.jsp");
}




%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
    
    <body style="background-color:#a1ff52;">
        <!-- navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand text-white" href="#">PetAdoption</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active text-white" aria-current="page" href="AboutUs.jsp">About Us</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" href="#">Contact Us</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link text-white" href="#">Main Page</a>
        </li><!-- comment -->

        <li class="nav-item">
            <a class="nav-link text-white" href="#">Articles</a>
        </li>
          
            
        </li>
        
 
      </ul>
      <form class="d-flex">
        <a class="nav-link text-white" href="#!" data-bs-toggle="modal" data-bs-target="#exampleModal"><i class="fa fa-user-circle" aria-hidden="true"></i>&nbsp;&nbsp;<%=admin.getAdminName()%>  
        </a>>
        <a class="nav-link text-white" href="AdminLogoutServlet"><span class=""></span>LOGOUT</a>
      </form>
        
        
    </div>
  </div>
</nav>
      
       

        <!-- end of nav bar -->
        
        
        <!--profile modal-->

        <!-- Button trigger modal -->
<!--<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal"><%=admin.getAdminName()%>
  Launch demo modal
</button>-->

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
        <div class="modal-header text-white text-center" style="background-color:#1c1d1b;">
        <h5 class="modal-title" id="exampleModalLabel">PetAdoption</h5>
        <button type="button" class="btn-close bg-light" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
        
      <div class="modal-body">
      <div class="container text-center"  
           <h5 class="modal-title text-center" id="exampleModalLabel"><%=admin.getAdminName()%></h5>
      
      <!--details-->
      
      <div id="profile-details">
      
      <table class="table">
  
  <tbody>
      <tr>
  <img src="img/profile_img.jpg" alt="" width="100px" height="100px"/>
    </tr>
      
      
    <tr>
      <th scope="row">Admin ID</th>
      <td><%=admin.getAdminId()%></td>
      
    </tr>
    
    <tr>
      <th scope="row">Admin Name</th>
      <td><%=admin.getAdminName()%></td>
      
    </tr>
    
    <tr>
      <th scope="row">Email</th>
      <td><%=admin.getAdminEmail()%></td>
      
    </tr>
    <tr>
      <th scope="row">Phone No</th>
       <td><%=admin.getAdminPhoneNo()%></td>
      
    </tr>
    
    <tr>
      <th scope="row">Password</th>
       <td><%=admin.getAdminPassword()%></td>
      
    </tr>
    
  </tbody>
</table>
      </div>
      
       <!--profile-edit-->
       
       <div id="profile-edit" style="display:none;">
           
           <h3 class="mt-2">Please Edit Carefully</h3>
           <form action="AdminEditServlet" method="post" enctype="multipart/form-data">
               
               <table class="table">
                   
                         <tr>
                            <img src="img/profile_img.jpg" alt="" width="100px" height="100px"/>
                         </tr>
                   
                   <tr>
                       <td>Admin ID</td>  
                       <td><%=admin.getAdminId()%></td> 
                   </tr>
                   
                   <tr>
                       <td>Admin Email</td>  
                       <td><%=admin.getAdminEmail()%></td> 
                   </tr>
                   
                    <tr>
                       <td>Name</td>  
                       <td><input type="text" class="form-control" name="adminName" value="<%=admin.getAdminName()%>"</td> 
                   </tr>
                   
                   
                     <tr>
                       <td>Phone</td>  
                       <td><input type="text" class="form-control" name="adminPhoneNo" value="<%=admin.getAdminPhoneNo()%>"</td> 
                   </tr>
                   
                     <tr>
                       <td>Password</td>  
                       <td><input type="text" class="form-control" name="adminPassword" value="<%=admin.getAdminPassword()%>"</td> 
                   </tr>
                   
                   
               </table>
                   
                   <div class="container">
                       <button type="submit" class="btn text-white" style="background-color:#1c1d1b;">Save</button>
                   </div>
           </form>
           
       </div>
       
       
       
      </div>
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button  id="edit-profile-button" type="button" class="btn text-white" style="background-color:#1c1d1b;">Edit</button>
       
        
        
        <form action="AdminDeleteServlet" method="POST" enctype="multipart/form-data">
           <!--  <button class="btn" style="background-color:#1c1d1b;"><a href="AdminDeleteServlet?=id" style="color:white;">DELETE</a></button>-->
 <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#delete-modal" style="background-color:#1c1d1b;">Delete</button>

</button>
            
            
            
       </form>
        
        
                <!-- to create delete alert box using modal toggle -->
        <!-- Button trigger modal -->


<!-- Modal -->
<div class="modal fade" id="delete-modal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
        <div class="modal-header" style="background-color:#1c1d1b;">
        <h5 class="modal-title text-white" id="exampleModalLabel">Delete Confirmation</h5>
        <button type="button" class="btn-close bg-light" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body" style="background-color:#a1ff52;">
       Are you sure you want to delete your Account?
      </div>
      <div class="modal-footer" style="background-color:#a1ff52;">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">No</button>
        <form action="AdminDeleteServlet" method="POST" enctype="multipart/form-data">
            <button class="btn" style="background-color:#1c1d1b;"><a href="AdminDeleteServlet?=id" style="color:white;">YES</a></button>

            
            
       </form>
      </div>
    </div>
  </div>
</div>
      </div>
    </div>
  </div>
</div>
       
       <!--end of profile modal--> 
       
 <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>

<script>
    
    $(document).ready(function () {
        let editStatus = false;
        

         $('#edit-profile-button').click(function() 
         {
             //alert("button clicked")
             
          if(editStatus == false) 
          {
          $("#profile-details").hide()
             
          $("#profile-edit").show()
          editStatus=true;
          $(this).text("Back")
          
             }else
             {
          
            $("#profile-details").show()
             
          $("#profile-edit").hide()
         editStatus=false;
          $(this).text("Edit")
             }
         });
        
    });
    
</script>




    </body>
</html>

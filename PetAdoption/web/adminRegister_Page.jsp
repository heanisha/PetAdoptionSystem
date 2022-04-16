<%-- 
    Document   : adminRegister_Page
    Created on : 18 Jan 2022, 10:07:22 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pet Adoption</title>
      <link rel="icon" href="/images/1.png""/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
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
        
         <%@include file="normal_navbar.jsp"%>
       
        <main class="primary-background banner-background" style="padding-botton:50px; height:700px; " >
            <div class="container"  >
                  <br>  <br>
               <div class="col-md-6 offset-md-3 "  > 
                   <div class="card text-white"  style="background-color:#1c1d1b; margin-top:35px;">
                       <div class="card-header text-center  text-white" style="background-color:purple;" >
                           <span class="fa fa-3x fa-user-circle text-white"></span>
                           <br>
                           Register Here
                           
                           
                           
                       </div> 
                       
                       <div class="card-body">
                        <form id="reg-form" action="AdminRegisterServlet" method="POST">
    <div class="form-group">
    <label for="admin_id">Admin ID</label>
    <input name="adminId" required type="text" text-white class="form-control" id="admin_id" aria-describedby="emailHelp" placeholder="E.g AD001">
  </div>
                                   
                            
                            
                            
 <div class="form-group">
    <label for="admin_Name">Admin Name</label>
    <input name="adminName" required type="text" class="form-control" id="admin_name" aria-describedby="emailHelp" placeholder="Enter Name">
  </div>
 
 <div class="form-group">
    <label for="admin_Email">Admin Email</label>
    <input name="adminEmail"   required type="email" class="form-control" id="email" placeholder="Enter Email">
  </div>
          
 <div class="form-group">
    <label for="admin_PhoneNo">Admin Phone No</label>
    <input name="adminPhoneNo"   required type="text" class="form-control" id="phone no" placeholder="Enter Phone No">
  </div>
                            
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="adminPassword"   required type="password" class="form-control" id="password" placeholder="Enter Password">
  </div>
                            
                                           
  <div class="form-check">
    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Agree Terms and Conditions</label>
  </div>
                            
                            <br>    
                            <div class="container text-center" id="loader" style="display: none;">
                            <span class="fa fa-repeat fa-spin fa-3x"></span>
                            <h4>please wait</h4><!-- comment -->
                            </div>
                             <div class="container text-center text-center">
                            <button id="submit-btn" type="submit" class="btn btn-primary  text-muted" style="align-items:center; background-color:white">SIGN UP</button>
                             </div>
                            
                             
</form>   
                           
                       </div>
                       
                       
                   </div>
                
            </div>
            
            
            
        </main>
        
        
        
        
        
        
        
        
        
        
        
        
        
         <script src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<script>
    $(document).ready(function () {
        console.log("loaded.......");
        
        $('#reg-form').on('submit', function(event){
           event.preventDefault();
           
           let form=new FormData(this);
           
           $("#submit-btn").show();
           $("#loader").hide();
           //send register servlet
            $.ajax({
               url:"AdminRegisterServlet",
               type:'POST',
               data:form,
               success:function (data,textStatus,jqXHR) {
                 console.log(data);
                 
           $("#submit-btn").show();
           $("#loader").hide();
           
           if(data.trim()==='done')
           {
               
     swal("You have Sign Up SUCESSFULLY").then((value) => {
 window.location="adminLogin_page.jsp";
});

           }else{
               
                 swal(data);
           }
               },
               error: function(jqXHR, textStatus, errorThrown) {
                   $("#submit-btn").show();
                   $("#loader").hide();
                  swal("Something wrong. Try again");

               },
               processData:false,
               contentType: false
            });
        });
    });
    
    
    
    
</script>








    </body>
</html>

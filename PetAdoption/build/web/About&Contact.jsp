<%@page import="java.util.List"%>
<%@page import="com.pet.adoption.entities.About"%>
<%@page import="com.pet.adoption.dao.AboutDao"%>
<%@page import="com.pet.adoption.DB.ConnectionProvider" %>
<!DOCTYPE html>
<html>
<head>
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
    
    <body style="background-color:white;">
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
          <a class="nav-link active text-white" aria-current="page" href="Homepage.jsp">Homepage</a>
        </li>
        
          
            
        </li>
        
 
      </ul>
      <form class="d-flex">
        <a class="nav-link text-white" href="#"><span class=""></span>Sign Up</a>
        <a class="nav-link text-white" href="#"><span class=""></span>Sign In</a>
      </form>
        
        
    </div>
  </div>
</nav>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

html {
  box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.column {
  float: left;
  width: 33.3%;
  margin-bottom: 16px;
  padding: 0 8px;
}

.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  margin: 8px;
}

.about-section {
  padding: 50px;
  text-align: center;
  background-color: #474e5d;
  color: white;
}

.container {
  padding: 0 16px;
}

.container::after, .row::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
}

.button:hover {
  background-color: #555;
}

@media screen and (max-width: 650px) {
  .column {
    width: 100%;
    display: block;
  }
}
</style>

<% 

AboutDao pd = new AboutDao();
List<About> about = pd.selectAllAbout();
%>

</head>
<body>

<div class="about-section">
  <h1>About Us Page</h1>
   <%
                                          if(!about.isEmpty()) { 
                                          for (About p:about) {
                                     %>
                                     
                                     <div class="col-md-3 my-3 ">
            <div class="card w-1000" style="width: 50rem; align-content:center; margin-left:90%; ">
         
 
                <div class="card-body" style="background-color:white; height:200px; color:black; text-align:justify-all" >
        
                    <p><%=p.getDetails()%></p>
    
          
   <div class="mt-3 d-flex justify-content-between">
           
         
   </div>

   </div>
  
            
           </div>
           </div> 
          
          
           
  
</div>
    <%     
              }       
                }
      %> 

      <p></p> 
      <h2 style="text-align:center">Contact</h2>
<div class="row">
 
                                     
                                     
            
</div>

</body>
</html>

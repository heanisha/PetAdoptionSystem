<%-- 
    Document   : index
    Created on : 19 Jan 2022, 1:33:13 AM
    Author     : User
--%>

<%@page import="ConnectionProvider.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
          <%
          Connection con = ConnectionProvider.getConnection();
        %>
    </body>
</html>

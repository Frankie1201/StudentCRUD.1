<%-- 
    Document   : Create
    Created on : 29 Jun 2021, 10:54:40
    Author     : francescaworsnop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Student</title>
    </head>
    <body>
        
        <!-- Using JSP tag : include master.html page -->
        <jsp:include page="Master.html"/>
        
    <center><h3>Student Create</h3>
        
        <!-- create form for student records -->
        <form action="create" method="get">
            
            Student ID: <input type="text" name="sid"/>
            <br/>
            Student First Name: <input type="text" name="fname"/>
            <br/>
            Student Last Name: <input type="text" name="lname"/>
            <br/>
            Student Score: <input type="text" name="score"/>
            <br/>
            <input type="submit" value="Insert"/>
           
        </form>
     </center>    
    </body>
</html>


<%-- 
    Document   : Delete
    Created on : 29 Jun 2021, 10:55:19
    Author     : francescaworsnop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Student</title>
    </head>
    <body>
        
        <!<!-- Using JSP tag : include master.html page -->
        <jsp:include page="Master.html"/>
        
        <center><h3>Delete Student</h3>
        
        <!-- create form for student records -->
        <form action="delete" method="get">
            Student ID: <input type="text" name="sid"/>
            <br/>
        <input type="submit" value="Delete"/></center>
        </form>
    </body>
</html>

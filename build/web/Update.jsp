<%-- 
    Document   : Update
    Created on : 29 Jun 2021, 10:55:07
    Author     : francescaworsnop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>
        
        <!<!-- Using JSP tag : include master.html page -->
        <jsp:include page="Master.html"/>
        
        <center><h3>Update Student</h3>
        
        <!-- create form for student update -->
        <form action="update" method="get">
            
            Student ID : <input type="text" name="sid"/>
            <br/>
            Student Score : <input type="text" name="score"/>
            <br/>
            <input type="submit" value="Update"/>
        </center>
        </form>
    </body>
</html>

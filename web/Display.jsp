<%@ page import = "java.sql.Connection"%>
<%@ page import = "java.sql.Statement"%>
<%@ page import = "java.sql.ResultSet"%>
<%@ page import = "com.tta.model.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Student</title>
    </head>
    <body>
        
        <!<!-- Using JSP tag : include master.html page -->
        <jsp:include page="Master.html"/>
        
    <center><h3>Student Display</h3></center>
   
      <%
        try
        {
            Connection con = DBConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "select * from student";
            
            ResultSet rs = stmt.executeQuery(qry);//return ResultSet-> holds all rows from table
            
       %>
       <table>
           <%
            while(rs.next())
            {
                %>
            
            <tr>
                <td> <%= rs.getInt(1)%> </td>
                <td> <%= rs.getString(2)%> </td>
                <td> <%= rs.getString(3)%> </td>
                <td> <%= rs.getInt(4)%> </td>
            </tr>
        <%
            }//while ends 
        %>
         </table> 
        <%
            }
            catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }
        %>
    
               
    </body>
</html>

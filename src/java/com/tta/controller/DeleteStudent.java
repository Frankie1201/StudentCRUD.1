
package com.tta.controller;

import com.tta.model.StudentQuery;
import com.tta.model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteStudent extends HttpServlet {
    
    int sid;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
          sid = Integer.parseInt(request.getParameter("sid"));
          
          int r = StudentQuery.delete(sid);
          
          if(r==1)
          {
            out.print("Student record deleted successfully");
            request.getRequestDispatcher("Display.jsp").include(request, response);
            
          }
        else
        {
            out.print("Error.......Record can not be deleted");
            request.getRequestDispatcher("Delete.jsp").include(request, response);
                }
          
        }
    }
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

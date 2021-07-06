
package com.tta.controller;

import com.tta.model.StudentQuery;
import com.tta.model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateStudent extends HttpServlet {
    
    int sid;
    String firstName;
    String lastName;
    int score;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            
            //getting request parameters
            sid = Integer.parseInt(request.getParameter("sid"));//String->Int
            firstName = request.getParameter("fname");
            lastName = request.getParameter("lname");
            score = Integer.parseInt(request.getParameter("score"));
            
            //create student object
            Student s = new Student(sid,firstName,lastName,score);
            
            //insert student into DB
            int r = StudentQuery.insert(s);
            
            if(r==1)
            {
                out.print("Student Record Saved"); 
                request.getRequestDispatcher("Display.jsp").include(request, response);
            }//if ends
            else{
                out.print("Error......Can not save record");
                request.getRequestDispatcher("Create.jsp").include(request, response);
            }//else ends
        }
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

package com.tta.controller;

import com.tta.model.StudentQuery;
import com.tta.model.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateServlet extends HttpServlet {
    
    int sid;
    int score;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            
            //getting request parameters
            sid = Integer.parseInt(request.getParameter("sid")); //String->int
            score = Integer.parseInt(request.getParameter("score")); //String->int
            
            //Update Student in DB
            int r = StudentQuery.update(sid, score);
            
            if(r==1)
            {
                out.print("Student record updated");
                request.getRequestDispatcher("Display.jsp").include(request, response);
            }
            else
            {
                out.print("Error......Can not Update record");
                request.getRequestDispatcher("Update.jsp").include(request, response);
            }
            
            
        }
            
        }
    
            
    
}


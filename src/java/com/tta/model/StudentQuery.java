
package com.tta.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;//pre-compiled statement
import java.sql.ResultSet;


public class StudentQuery {
    
    //1. Insert Student Record
    public static int insert(Student s)
    {
        Connection con = DBConnection.connect();
         int row_insert = 0;
         
        try
        {
         String qry = "insert into Student(sid,firstName,lastName,score) values(?,?,?,?)";
         PreparedStatement stmt = con.prepareStatement(qry);//query getting pre-compiled
         
         stmt.setInt(1, s.getSid());
         stmt.setString(2, s.getFirstName());
         stmt.setString(3, s.getLastName());
         stmt.setInt(4, s.getScore());
         
         row_insert = stmt.executeUpdate();
        
        }
        catch(Exception ex)
                {
                    System.out.println("Insert error : "+ex);  
                }
        return row_insert;
        
    } //insert ends
    
    //2. update -> int
    public static int update(int sid , int up_score)
    {
        int row_update = 0;
        try
        {
            Connection con = DBConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "update student set score="+up_score+" where sid="+sid;
            
            row_update = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Update Error :"+ex);
        }
        
        return row_update;
    }
    
    //3. delete -> int
    public static int delete(int sid)
    {
        int row_delete = 0;
        try
        {
            Connection con = DBConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "delete from student where sid="+sid;
            
            row_delete = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }
        
        return row_delete;
    }
    
    //4. select -> void
    public void display()
    {
        try
        {
            Connection con = DBConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "select * from student";
            
            ResultSet rs = stmt.executeQuery(qry);//return ResultSet-> holds all rows from table
            
            //read all data
            //next() -> check if next row is present
            while(rs.next())
            {             
                int i = rs.getInt(1);
                String f = rs.getString(2);
                String l = rs.getString(3);
                int s = rs.getInt(4);
                
                System.out.println("SID :"+i);
                System.out.println("FIRST NAME :"+f);
                System.out.println("LAST NAME :"+l);
                System.out.println("SCORE :"+s);
                
                System.out.println("========================");
                
            }//while ends
            
        }
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }
    }
    
}//class ends

package com.tta.model;

//Only DB Coonection
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect()
    {
        Connection con = null;
        try
        {
            
        Class.forName("com.mysql.cj.jdbc.Driver");//mysql DB
        String URL = "jdbc:mysql://localhost:3306/tta?autoReconnect=true&useSSL=false";//DB location
        String user = "root";//DB user name
        String pwd = "passwordR00T";//DB password
        
        con = DriverManager.getConnection(URL , user , pwd);           
        }//try ends
        catch(Exception ex)
        {
            System.out.println("DB Error :"+ex);
        }//catch ends
        
        return con;
        
    }//main ends
    
}

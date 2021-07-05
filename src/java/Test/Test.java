
package Test;

import com.tta.model.DBConnection;
import java.sql.Connection;//to test connection

public class Test {
    public static void main(String[] args) {
        
       try
       {
           Connection con = DBConnection.connect();
           if(con != null)
           {
               System.out.println("Connection ok");
           }
       }//try ends
       catch(Exception ex)
        {
            System.out.println("DB Error"+ex);        
        }//catch ends
        
    }//main
    
}//class ends

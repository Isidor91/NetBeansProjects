package Model;

import java.sql.Connection;
import java.sql.DriverManager;


public class Konekcija 
{
    private static Connection conn=null;    
    private Konekcija(){}
    public static Connection konekcija()
    {
      if(conn==null)
        {
            try 
           {
              Class.forName("com.mysql.cj.jdbc.Driver");
           }
           catch(ClassNotFoundException ex){}       
        }        
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","1234");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
}

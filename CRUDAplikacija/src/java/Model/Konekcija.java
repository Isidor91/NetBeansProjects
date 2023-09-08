package Model;
import java.sql.*;
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
               Class.forName("com.mysql.jdbc.Driver");
            }
            catch(ClassNotFoundException ex){}
        }        
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
        }
        catch(SQLException ex){}
        return conn;
    }
}

    


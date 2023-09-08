package opserver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Connect 
{
    private static Connection conn;
    private Connect() 
    {}
    public static Connection ConnectToDtbs() 
    {
        try
        {
            if(conn == null)
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/opserver" , "root" , "1234");
        }
        catch (SQLException ie)
        {
        System.out.println(ie);
        }
        return conn;
    }
    

}

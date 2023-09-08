package Konekcija;
import java.sql.*;

public class konekcija 
{
    private static Connection con = null ; 
    private konekcija() {}
    public static Connection KonektujSe() 
    {
        try
        {
            if ( con == null)
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library" , "root" , "1234");
        }
        catch (SQLException e)
        {
            System.out.println("GRESKA!!!");
        }
        return con;     
}
}

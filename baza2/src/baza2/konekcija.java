package baza2;
import java.sql.*;
public class konekcija 
{
    public static Connection con;
    public static Connection poveziSe() 
    {
        try 
        {
            if(con==null)
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/korisnici" , "root" , "1234");
        }
    
        catch(SQLException ex){} 
        return con;
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   

}
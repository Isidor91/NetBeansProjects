package baza2;
import java.sql.*;
public class Usluge 
{
    Connection Konekcija ; 
    public Usluge() throws SQLException
    {
        Konekcija = konekcija.poveziSe();
    }
    public void listajKorisnike() throws SQLException
    {
        Statement st = Konekcija.createStatement();
        String upit = " Select * from korisnici ";
        ResultSet rs = st.executeQuery(upit);
        while(rs.next())
        {
            
           System.out.println(rs.getInt("korisnici_id"  ));
           System.out.println(rs.getString("usename"  ));
           System.out.println(rs.getString(3));
        }

    }
        public void dodajKorisnika(String un , String pass) throws SQLException
        {
            
            String upit = "Insert into korisnici " + " values (null,' " + un + " ',' " + pass + "')";
            Statement st =  Konekcija.createStatement();
            st.executeUpdate(upit);
        }
        
        public void listajKorisnikeProc () throws SQLException
        {
            String upit =" call listaj ()" ;
            CallableStatement stmt = Konekcija.prepareCall (upit);
            ResultSet rs = stmt.executeQuery();
            while (rs.next())
            {
                  System.out.print(rs.getInt(1) + " ");
                  System.out.print(rs.getString(2 ) + " " );
                  System.out.println(rs.getString(3));
            }
            
        }
       
}



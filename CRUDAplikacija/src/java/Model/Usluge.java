package Model;
import Entiteti.Korisnik;
import java.sql.*;
import java.util.ArrayList;
public class Usluge 
{
    private static Connection kon;
    private static Statement st;
    private static ResultSet rs;
    private static ArrayList<Korisnik> lista = new ArrayList();
    private static Statement poveziSe() throws SQLException            
    {
        kon = Konekcija.konekcija();  
        return kon.createStatement() ;
    }
    public static ArrayList<Korisnik> listajSve() throws SQLException
    {   
        
            st = poveziSe();
            rs = st.executeQuery("select * from login");  
        while(rs.next())
        {
           
            lista.add(new Korisnik(rs.getInt(1),rs.getString(2),rs.getString(3)));
            //System.out.println(k);
           /* System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));*/
        }
        
        return lista;
        
    }
    public static boolean login(Korisnik k) throws SQLException
    {
        st = poveziSe();
        String upit = "select * from login where ime = '" + k.getIme() + "' and lozinka = '" + k.getLozinka() + "'";
        rs = st.executeQuery(upit);  
        if(rs.next()) return true;
        return false;
    }
    public static void unesi(Korisnik k) throws SQLException
    {
        st = poveziSe();
        String upit = "insert into login values (null,'" + k.getIme() + "','" +k.getLozinka() + "')";
        if(!login(k)) st.executeUpdate(upit);
    }
}

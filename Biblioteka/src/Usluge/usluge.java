package Usluge;
import java.sql.*;
import Konekcija.konekcija;

public class usluge 
{
    Connection Konekcija;
    Statement st;
    ResultSet rs;
    public usluge() throws SQLException
    {
        Konekcija = konekcija.KonektujSe();
        st = Konekcija.createStatement();
    }

    public void listajAutore()  throws SQLException 
    {        
        String upit = "Select * from autor";
        rs = st.executeQuery(upit);
        while(rs.next())
        {
            System.out.print(rs.getInt(1)+ " ");
            System.out.println(rs.getString("ime"));
          
        }                        
    }
    public void pisiAutorapoIDu(int id) throws SQLException
    {
        String upit = "select ime from autor where autor_id ="+id;
        rs = st.executeQuery(upit);
        if(rs.next())
        {
            System.out.println(rs.getString("ime"));
        }
    }
    public void ispisiKnjigeAutora(String ime)throws SQLException
    {
        String upit = "select autor.ime,knjiga.naziv \n" +
                      "from autor join knjiga \n" +
                      "on autor.autor_id = knjiga.autor_autor_id\n" +
                      "where ime='"+ime+"'";
        rs = st.executeQuery(upit);
        while(rs.next())
        {
            System.out.print(rs.getString("ime")+" ");
            System.out.println(rs.getString("naziv"));
        }
    }
    public boolean login(String ime)throws SQLException
    {
        String upit = "select ime from autor where ime ='"+ime+"'";
        rs = st.executeQuery(upit);
        while(rs.next()) return true; // autor postoji u bazi
        return false; // u suprotnom ga nema
    }
    public void registracija(String ime)throws SQLException
    {
       String upit = "insert into autor values(null,'"+ime+"')";
       if(login(ime)==true)//korisnik postoji u bazi
       {
            System.out.println("Korisnik vec postoji");
            return;
       }
       //ako se prodje if korisnik ne postoji u bazi
       st.executeUpdate(upit); // insert korisnika u bazu
            System.out.println("Uspesno ste se registrovali");
    }
}

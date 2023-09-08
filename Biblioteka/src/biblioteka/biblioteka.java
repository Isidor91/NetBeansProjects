package biblioteka;
import Konekcija.konekcija;
import Usluge.usluge;
import java.sql.*;
public class biblioteka 
{
    public static void main(String[] args) throws SQLException
    {  
      //  Connection c = konekcija.KonektujSe();
     usluge ls =new usluge();
     ls.pisiAutorapoIDu(2);
     ls.listajAutore();
     ls.ispisiKnjigeAutora("Marija");
     if(ls.login("Isidora"))
     
         System.out.println("Uspesno ste se ulogovali");
     else
     
             System.out.println("Nedozvoljen pristup");
     ls.registracija("Isidor");
     ls.registracija("Milan");
}                             
}

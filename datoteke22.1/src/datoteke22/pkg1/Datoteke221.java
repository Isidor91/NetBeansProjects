package datoteke22.pkg1;

import java.io.IOException;
import java.util.ArrayList;

public class Datoteke221 
{
    public static void main(String[] args)  
    {
    try{
    UnosCitanje uc = new UnosCitanje();
    
    
   
    ArrayList<Person> osobe = new ArrayList();
    osobe.add(new Person("Milan","28","2A"));
    osobe.add(new Person("Stevan","24","3A"));
    osobe.add(new Person("Marija","30","4A"));
            System.out.println(osobe);
            uc.dodajOsobu(osobe);
            uc.upisUDatoteku();
            uc.dodajPol('M');
             uc.citanje();
             uc.citanje2();
             uc.upis2();
             uc.unos3();
        }catch(IOException ex)
        {
            System.out.println("Greska u radu sa datotekom");
        }
        
    }
    
}

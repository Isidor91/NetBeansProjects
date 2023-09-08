package sastav;
import java.util.ArrayList;

public class Menadzer extends Zaposleni
{   
   
    private ArrayList<Zaposleni> lista;
    public Menadzer(String ime) 
    {
        super(ime);
        lista = new ArrayList();        
    }
    
    @Override
    public void dodaj(Zaposleni z) 
    {
       lista.add(z);
    }
    @Override
    public String toString()
    {
       String s = "Menadzer{" +ime+ "} rukovodi nad:";
       for(Zaposleni z:lista)
           s+=z+"\n";
       return s;
    }
    
    
}

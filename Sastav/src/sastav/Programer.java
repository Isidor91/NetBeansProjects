package sastav;
public class Programer extends Zaposleni
{
   
    public Programer(String ime) 
    {
       super(ime);
    }
    
    @Override
    public String toString()
    {
       return "Programer{" +ime+ '}';
    }

    @Override
    public void dodaj(Zaposleni z) {
        //ovde se nista ne dodaje.
    }
}

package sastav;
public abstract class Zaposleni 
{
    protected String ime;

    public Zaposleni(String ime) {
        this.ime = ime;
    }    
    public abstract void dodaj(Zaposleni z);
    @Override
    public abstract String toString();
   
}

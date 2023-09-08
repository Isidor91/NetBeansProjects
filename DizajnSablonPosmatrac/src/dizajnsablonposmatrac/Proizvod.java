package dizajnsablonposmatrac;
public abstract class Proizvod 
{
    protected double cena;
    protected Subjekat s;    
    public Proizvod(Subjekat s,double cena) 
    {
        this.cena = cena;
        this.s = s;
        s.dodajProizvode(this);
    }
    public abstract void azurirajCenu();
    @Override
    public String toString()
    {
        return "Proizvod" + " cena= " + cena;
    }
   
    
    
    
}

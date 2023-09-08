package dizajnsablonposmatrac;
public class PorezNaProfit extends Proizvod
{    
    public PorezNaProfit(Subjekat s, double cena) 
    {
        super(s, cena);
        this.cena+=this.cena*s.getPdvVeci()/100;
    }
    @Override
    public void azurirajCenu()
    {
        cena+=30*cena/100;
    }
    @Override
    public String toString() 
    {
        return "PorezNaProfit " + super.cena;
    }
    
}

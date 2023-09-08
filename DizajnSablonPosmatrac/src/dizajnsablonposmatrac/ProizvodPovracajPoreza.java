package dizajnsablonposmatrac;
public class ProizvodPovracajPoreza extends Proizvod
{
    
    public ProizvodPovracajPoreza(Subjekat s, double cena) 
    {
        super(s, cena);
        this.cena+=this.cena*s.getPdvManji()/100;
        
    }
    @Override
    public void azurirajCenu()
    {
        cena+=10*cena/100;
    }
    @Override
    public String toString() 
    {
        return "ProizvodPovracajPoreza " + super.cena;
    }
}

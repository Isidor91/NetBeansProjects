package dizajnsablonposmatrac;
public class StandardniPorez extends Proizvod
{
    
    public StandardniPorez(Subjekat s, double cena) 
    {
        super(s, cena);
        this.cena+=this.cena*s.getPdv()/100;
    }
    @Override
    public void azurirajCenu()
    {
        cena+=s.getPdv()*cena/100;
    }
    @Override
    public String toString() 
    {
        return "StandardniPorez " + super.cena ;
    }
}

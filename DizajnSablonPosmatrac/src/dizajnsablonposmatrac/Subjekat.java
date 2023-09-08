package dizajnsablonposmatrac;
import java.util.ArrayList;
public class Subjekat 
{
    private ArrayList<Proizvod> proizvod;
    private int pdv;
    private int pdvManji,pdvVeci;
    public Subjekat(int pdvManji,int pdv,int pdvVeci) 
    {
        proizvod = new ArrayList();
        this.pdvManji = pdvManji;
        this.pdv = pdv;
        this.pdvVeci = pdvVeci;
    }
    public int getPdvManji() 
    {
        return pdvManji;
    }

    public void setPdvManji(int pdvManji) 
    {
        this.pdvManji = pdvManji;
    }

    public int getPdvVeci() {
        return pdvVeci;
    }

    public void setPdvVeci(int pdvVeci) {
        this.pdvVeci = pdvVeci;
    }
    
    public double getPdv() 
    {
        return pdv;
    }
    public void setPdv(int pdvManji,int pdv,int pdvVeci) 
    {
        this.pdvManji = pdvManji;
        this.pdv = pdv;
        this.pdvVeci = pdvVeci;        
        obavestiPosmatrace();
    }    
    public void dodajProizvode(Proizvod p)
    {
        proizvod.add(p);
    }
    public void obavestiPosmatrace()
    {
        for(Proizvod p : proizvod)
            p.azurirajCenu();
    }
    public void prikaziPosmatrace()
    {
        for(Proizvod p : proizvod)
            System.out.println(p);
    }

    
}

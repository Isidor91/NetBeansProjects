package sastav;
import java.util.ArrayList;
public class Kvadat extends Oblik
{
    private double p;
    private ArrayList<Oblik> lista;

    public Kvadat(double p) 
    {
        this.p = p;
        lista = new ArrayList();
    }
    
    @Override
    protected double povrsina() 
    {
        double pom = p*p;
        for(Oblik o:lista)
            pom+=o.povrsina();
        return pom;
    }

    @Override
    public String toString() 
    {
       String s="";
       s+="Kvadrat("+p+")sadrzi:\n";
       for(Oblik o : lista)
            s+=0+"\n";
       return s;
    }

    public void dodajOblik(Oblik o) 
    {
        lista.add(o);
    }
    
}

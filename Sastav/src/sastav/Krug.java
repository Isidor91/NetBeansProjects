package sastav;

import java.util.ArrayList;

public class Krug extends Oblik
{
    private double r;
    private ArrayList<Oblik> lista;

    public Krug(double r) 
    {
        this.r = r;
        lista = new ArrayList();
    }
    
    @Override
    protected double povrsina() 
    {
       double pom = r*r*Math.PI;
        for(Oblik o:lista)
            pom+=o.povrsina();
        return pom;
    }
 
    @Override
    public String toString() 
    {
        String s = "";
        s+="Krug("+r+")sadrzi:\n";
        for(Oblik o : lista)
            s+=0+"\n";
        return s;
        
    }

    @Override
    public void dodajOblik(Oblik o) 
    {
       lista.add(o);
    }
    
}

package sabloni;
import java.util.ArrayList;
public class SablonKlasa <e>
{
    private ArrayList <e> lista;
    
    public SablonKlasa() 
    {
        this.lista = new ArrayList();
    }
    public void dodaj(e t)
    {
        lista.add(t);
    }
    public int vratiBroj(e t)
    {
        if(t instanceof Kvadar) return 1;
        return 2 ;
    }
    public e vratiClana(int i)
    {
        return lista.get(i);
    }

    @Override
    public String toString() 
    {
       String s = "";
       for(e t : lista)
           s+=(t+"\n");
       return s;
    }
    
}

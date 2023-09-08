package sabloni;
public class Lista<E>
{
    private Elem<E> glava;
    private class Elem<E>
    {
        private E t;
        private Elem sled;
        public Elem(E t) {
            this.t = t;
        }
        
    }
       
    // dodavanje na pocetak
    public void dodajNaPocetak(E obj)
    {
        if(glava == null) glava = new Elem<E>(obj) ; 
        else
        {
            Elem<E> novi = new Elem<E>(obj);
            novi.sled = glava;
            glava = novi;
        }
    }

    @Override
    public String toString() 
    {
        String s = "";
        Elem<E> e = glava;
        while(e != null)
        {
            s+=e.t + "\n";                   
            e = e.sled;
        }        
        return s;
    }
    
    
   
   
}

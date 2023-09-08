package sabloni;
public class Sabloni 
{
    public static void main(String[] args) 
    {
        int n = 7;
        Telo []niz = new Telo[n];
        for(int i = 0 ; i < niz.length ; i++)       
            if (i%2==0) niz[i] = new Kvadar (1,2,3);
            else niz[i] = new Kupa(7,3);
        for(int i = 0 ; i < niz.length ; i++)
            System.out.println(niz[i]);
        System.out.println("-----Samo kupe------");
        SablonKlasa sk = new SablonKlasa<Telo>();
        for(int i = 0 ; i < niz.length ; i++)
            if(niz[i] instanceof Kupa)
               sk.dodaj(niz[i]);
        System.out.println(sk.toString());
        SablonKlasa sk2 = new SablonKlasa<String>();
        sk2.dodaj("Isidor");
        sk2.dodaj("je");
        sk2.dodaj("car");
        System.out.print(sk2);
        Lista l = new Lista<Telo>();
        l.dodajNaPocetak(new Kvadar(5,7,9));
        l.dodajNaPocetak(new Kupa(5,7));
        System.out.println(l);
        Lista l2 = new Lista<String>();
        l2.dodajNaPocetak("Danas");
        l2.dodajNaPocetak("je");
        l2.dodajNaPocetak("lepo");
        System.out.println(l2);
            
    }
    
}

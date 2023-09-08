package sastav;
public class ZaposleniMain 
{
    public static void main(String[] args) 
    {           
        Zaposleni men1 = new Menadzer("mika");
        Zaposleni men2 = new Menadzer("Ana"); 
        Zaposleni pro1 = new Programer("Wendy");
        Zaposleni pro2 = new Programer("Isidor");
        men2.dodaj(pro1);
        men1.dodaj(men2);
        men1.dodaj(pro2);
        System.out.println(men1);
    }
}

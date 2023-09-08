package dizajnsablonposmatrac;
public class DizajnSablonPosmatrac 
{
    public static void main(String[] args) 
    {
      Subjekat s = new Subjekat(10,20,30);
      Proizvod p2 = new ProizvodPovracajPoreza(s,70);       
      Proizvod p3 = new PorezNaProfit(s,70);
      Proizvod p4 = new StandardniPorez(s,70);
        s.prikaziPosmatrace();
        s.setPdv(5,10,15);
        s.prikaziPosmatrace();
        
    }
}




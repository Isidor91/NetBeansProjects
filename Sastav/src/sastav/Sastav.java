package sastav;
public class Sastav 
{
    public static void main(String[] args) 
    {
      Oblik krug1 = new Krug(100);
      Oblik kvadrat1 = new Kvadat(50);
      Oblik kvadrat2 = new Kvadat(20);
      Oblik krug2 = new Krug(10);
      Oblik tacka1 = new Tacka(2,3);
      Oblik tacka2 = new Tacka(5,7);
      kvadrat1.dodajOblik(tacka1);
       kvadrat1.dodajOblik(krug2);
       krug2.dodajOblik(tacka2);
       krug1.dodajOblik(kvadrat1);
       kvadrat1.dodajOblik(kvadrat2);
       System.out.println(krug1);
       Oblik kvadrat3 = new Kvadat(20);
       krug1.dodajOblik(kvadrat3);
        System.out.println(krug1.povrsina());
        
        
        
        
    }
    
}

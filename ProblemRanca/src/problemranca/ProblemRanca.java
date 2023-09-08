package problemranca;
public class ProblemRanca
{
    public static int broj=0;
    public static int broj2=3;
    public static void main(String[] args)
    {
     int n = 5;
     int suma = 0;
     for(int i = 0;i <= n;i++)     
         suma+=i;
         System.out.println("Suma("+n+")="+suma);    
        // poziv();
        //mojPoziv();
        //poziv2();
        poziv3(3);
    }
    public static void poziv()
     {
         broj++;
         System.out.println("U metodi poziv..."+broj);         
         if(broj<5) poziv();
         System.out.println("U povratku..."+broj--);
         return;         
     }
     public static void poziv2()
     {
         System.out.println(broj2--);
         if(broj2>0)poziv2();
         System.out.println(++broj2);
     }
     public static void poziv3(int n)
     {
         System.out.println(n);
         if(n>0)poziv3(n-1);
         System.out.println(n);
     }
     public static void mojPoziv()
     {
         broj++;
         System.out.println("ispis..."+broj);
         if(broj<3)mojPoziv();
         System.out.println("unazad..."+broj--);
         return;
     }
             
             
    
}

package rekurzija2;
public class Rekurzija2 
{
    public static void main(String[] args) 
    {
        int n = 50;
        //System.out.println(suma(n)); 
         System.out.println(suma2(n)); 
        //ispis(n);
    }
    public static int suma(int n)
    {
        if(n == 0)return 0;
        return n+suma(n-1);
     
    }
    public static void ispis(int n)
    {
        System.out.print(n+" ");
        if(n>0) ispis(n-1);
        System.out.print(n+" ");
    }
    public static int suma2(int n)
    {
        if(n == 1) return 1;
        return n*suma(n-1);
    }
    
}

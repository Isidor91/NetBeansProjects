package pkg18122018;
public class GlavniProgram 
{
    public static void main(String[] args) 
    {
       Matrica mm = unesi(3);
        System.out.println(mm);
        Matrica mmm = new Matrica(mm);
        System.out.println(mmm);
        Matrica zbirMat = Matrica.saberi(mm, mmm);
        System.out.println(zbirMat);
        zbirMat.saberiKlasicno(mm);
        System.out.println(zbirMat);
    }
    public static Matrica unesi(int n)
    {        
        Matrica m = new Matrica(n);
        m.unos();
        return m ;
    }
}

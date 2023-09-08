package pkg18122018;
import java.util.Scanner;
public class Matrica 
{
    private int [][]mat;
    public Matrica(int n)
    {
        mat = new int [n][];
        for(int i = 0;i<mat.length;i++)
            mat[i]=new int[(int)(Math.random()*n)+1];
    }
    public Matrica (int [][] mat)
    {   
        this.mat = mat;
    }
    public Matrica(Matrica matr)//Konstruktor kopije
    {
        // Kreiranje broja vrsta kao i matr
        this.mat = new int [matr.mat.length][];
        // Kreiranja kolona kao i matr
        for(int i = 0;i<matr.mat.length;i++)
                this.mat[i]=new int [matr.mat[i].length];
        prebaci(matr);        
    }
    public static Matrica saberi(Matrica a, Matrica b)
    {
        Matrica c = new Matrica (a);
        c.prebaci(b);
        return c;
    }
    public Matrica saberiKlasicno(Matrica b)
    {
        for(int i = 0;i<b.mat.length;i++)
            for(int j = 0;j<b.mat[i].length;j++)
                this.mat[i][j]+=b.mat[i][j];
        return this;
    }
    private void prebaci(Matrica matr)
    {
        //prebacivanje svih elemenata iz matr
        for(int i = 0;i<matr.mat.length;i++)
            for (int j = 0 ;j<matr.mat[i].length;j++)
                this.mat[i][j]+= matr.mat[i][j];
    }
    public void unos()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<mat.length;i++)
            for(int j = 0;j<mat[i].length;j++)
            {
                System.out.println("Unesi el.na.poz."+i+","+j);
                mat[i][j]= sc.nextInt();
            }
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0 ;i<mat.length;i++)
        {
            for(int j = 0;j<mat[i].length;j++)
                s+=(mat[i][j]+" ");
            s+="\n";
        }
        return s;
    }
    
}

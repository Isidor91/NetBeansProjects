package rekurzija;
public class PretragaPoDubini
{
    public static int n = 5;
    public static int []x = new int[n];
    public static void main(String[] args)
    {
     rek(0);
    }
    public static void rek(int i)
    {
        if(i==n)
        {
            for(int br:x)
            System.out.print(br+" ");
            System.out.println("");
        }
        else
        {
            x[i]=1;
            rek(i+1);
            x[i]=0;
            rek(i+1);
        }
    }
}

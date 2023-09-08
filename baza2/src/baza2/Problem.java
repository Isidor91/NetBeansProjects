package baza2;
import java.util.ArrayList;
public class Problem 
{
    public static void main(String[] args) 
    {
        int []a = {1,2,3,3,3,4,5,5,5,6,7,7,8,9} ;
        ArrayList samci = new ArrayList (); 
        boolean vec_bio = false;
        for ( int  i  = 0; i < a.length - 1 ; i++ )
        {
            if (a[i] != a[i+1] && vec_bio == false)
            samci.add(a[i]);
            if (a[i] == a[i+1]) vec_bio = true ;
            else vec_bio = false ; 
        }
       
        if (a[a.length - 1] != a[a.length-2]) samci.add(a[a.length-1]);
        System.out.println(samci);
    }
}

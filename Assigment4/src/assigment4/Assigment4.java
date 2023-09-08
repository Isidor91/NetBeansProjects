package assigment4;
import java.util.Arrays;
public class Assigment4 
{
    public static void main(String[] args) 
    {
        int[] arr = {12,23,-22,0,43,545,-4,-55,43,12,0,-999,-87};
        
        int poz = 0;
        int neg = 0;
        
        for (int i = 0;i<arr.length;i++)//Petlja za izvlacenje pozitivnih i negativnih vrednosti.
        { 
            if (arr[i]>0)
                poz++;
            else if (arr[i]<0)
                neg++;                
        }
        int[] pozitivni = new int [poz];//Novi niz pozitvnih vrednosti.
        int[] negativni = new int [neg];//Novi niz negativnih vrednosti.
        
        int poz1 = 0;
        int neg1 = 0;
        for (int i = 0;i<arr.length;i++) //Petlja za dodeljivanje vrednosti u pozitivnom i negativnom nizu.
        {
            if(arr[i]>0)
            {
                pozitivni[poz1]=arr[i];
                poz1++;
            
            }
            else if (arr[i]<0)
            {
                negativni[neg1]=arr[i];
                neg1++;
            }
        }
        System.out.println(" Pozitivni niz : "+Arrays.toString(pozitivni));
        System.out.println(" Negativni niz : "+Arrays.toString(negativni));
        
          
        int dup = 0;
        for (int i = 0;i<arr.length;i++)
        {
            for (int k = i+1;k<arr.length;k++)
            {
                if (arr[i]==arr[k])
                    dup++;
            }
            if (dup==1)               
                System.out.println("Duplikati su :"+arr[i]);
            dup = 0;
            
                
        }
    }
}

    
    



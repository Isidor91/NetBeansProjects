package assigment6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Assigment6
{
       public static void main(String[] args) 
       {
       String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow ";
       String[] text2 = text.split("[. /]+");
       ArrayList osoba = new ArrayList();
       for (int i = 0 ; i< text2.length; i+=4)
       {
           String ime = text2[i];
           String prezime = text2[i+1];
           String godinaRodjenja = text2[i+2]; 
           String mestoRodjenja = text2[i+3];
           
           //"dd-MMM-yyyy"
           DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");            
           LocalDate datumRodjenja = LocalDate.parse(godinaRodjenja, europeanDateFormatter);
           
           Person person = new Person (ime, prezime, datumRodjenja, mestoRodjenja);
           osoba.add(person);           
        }
       for(Object o : osoba)
               System.out.println(o.toString());
       
        
           
       
       
       
       
       
       
       
       
       
 
       

     
        
       
       
       
        
       
    }
    
}

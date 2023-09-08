package generickeliste;
import java.util.ArrayList;
import java.util.Iterator;
public class GenerickeListe {
    public static void main(String[] args) 
    {
      /*  ArrayList<Integer>a = new ArrayList<>();
        a.add(5);
        Integer list = a.get(0);
        System.out.println(a);*/
        
       /* generickaKlasa<Integer,String,Boolean> klasa = new generickaKlasa<>(27,"Isidor",true);
        System.out.println(klasa.t +" "+klasa.u+ " "+klasa.s);*/
        
        ArrayList<Person> lista = new ArrayList<>();
        Person p = new Person ("Isidor","Dimitrijevic");
        Person p1 = new Person ("Stevan", "Zikic");
        lista.add(p);
        lista.add(p1); 
        for (Person p2 : lista) 
        {
            
            System.out.println("Name: "+p2.name+" Surname: "+p2.surname);
        }
        
        
    }
    
}

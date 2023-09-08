package assigment6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Person 
{
    public String ime;
    public String prezime;
    public LocalDate godinaRodjenja;
    public String mestoRodjenja;

    public Person(String ime, String prezime, LocalDate godinaRodjenja, String mestoRodjenja) 
    {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
        this.mestoRodjenja = mestoRodjenja;
    }

    @Override
    public String toString() 
    {  
        DateTimeFormatter serbianDateFormatter = DateTimeFormatter.ofPattern("dd.MMM yyyy", new Locale ("sr","RS"));
        return  "Ime: " + ime + ", Prezime: " + prezime + ", GodinaRodjenja: " + godinaRodjenja.format(serbianDateFormatter) + ", MestoRodjenja: " + mestoRodjenja;
    }
    
    
   
    }

     
    
    
    

 
    
    
    


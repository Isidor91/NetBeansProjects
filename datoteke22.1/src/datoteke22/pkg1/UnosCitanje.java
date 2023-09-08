package datoteke22.pkg1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class UnosCitanje 
{

    private Person p;
    private File file;
    private FileWriter fw;
    private ArrayList<Person> lista;
    public UnosCitanje() throws IOException 
    {
        p = new Person("Isidor","27","1A");
        file = new File("myFile.txt");
        file.createNewFile();
        fw = new FileWriter(file);
        lista = new ArrayList();
    }
     public void dodajOsobu( ArrayList<Person>lista)
    {
      this.lista = lista;
    }
      public void upisUDatoteku() throws IOException
    {        
        fw.write(p.toString()); 
        for(Person osoba : lista)
        {
            fw.write(osoba.toString());
        }
    }
      
    public void dodajPol(char c) throws IOException
    {
        fw.append(c);
        fw.close();
    }
    public void upis2() throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.newLine();
        writer.write(p.toString());
        writer.newLine();
        writer.write(p.toString());
        writer.close();
    }
           
    public void citanje() throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader(file);
        char[]a = new char[500];
        fr.read(a);
        for(char c:a)
            System.out.print(c);
        fr.close();
    }
    public void citanje2() throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String loadedPersonRaw = br.readLine();
        System.out.print(loadedPersonRaw);
        br.close();
        fr.close();
    }
    public void unos3() throws IOException
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt",true));
        bw.newLine();
        bw.write(p.toString());
        bw.newLine();
        bw.write(p.toString());
        bw.close();
    }
    
  
    
    
}

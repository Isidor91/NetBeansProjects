package Entiteti;
public class Korisnik
{
    private int id;
    private String ime;
    private String lozinka;
    public Korisnik() {}
    public Korisnik(String ime, String lozinka) 
    {
        this.ime = ime;
        this.lozinka = lozinka;
    }
    public Korisnik(int id, String ime, String lozinka) 
    {
        this.id = id;
        this.ime = ime;
        this.lozinka = lozinka;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    
    
}

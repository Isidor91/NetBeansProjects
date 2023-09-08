package automobil;
public class BMW extends Vozilo
{
    private final double BMW_335i = 220.0;
    public BMW(int godina_proizvodnje, double zapremina_motora, String boja, String marka, String model, long kilometraza, String owner) 
    {
        super(godina_proizvodnje, zapremina_motora, boja, marka, model, kilometraza, owner);
    }
    @Override
    public String toString() 
    {
        return super.toString() + "," + BMW_335i + " Mp/H "; 
    }

    @Override
    public double speed() 
    {
        return super.speed() + BMW_335i; 
    }
    
}

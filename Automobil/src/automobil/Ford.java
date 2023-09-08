package automobil;
public class Ford extends Vozilo
{
    private final double FORD_FUSION = 180.0;
    
    public Ford(int godina_proizvodnje, double zapremina_motora, String boja, String marka, String model, long kilometraza, String owner) 
    {
        super(godina_proizvodnje, zapremina_motora, boja, marka, model, kilometraza, owner);          
    }
    @Override
    public double speed() 
    {
        return super.speed() + FORD_FUSION;
    }
    @Override
    public String toString() 
    {
        return super.toString() +","+FORD_FUSION + " mp/H";
    }
    
    
    
    
}

package automobil;
public abstract class Vozilo 
{  
    private int godina_proizvodnje;
    private double zapremina_motora;
    private String boja;
    private String marka;
    private String model;
    private long kilometraza;
    private String owner;   
    private double maxSpeed;
    public Vozilo (int godina_proizvodnje,double zapremina_motora,String boja,String marka,String model,long kilometraza,String owner)
    {
        this.godina_proizvodnje = godina_proizvodnje;
        this.zapremina_motora = zapremina_motora;
        this.boja = boja;
        this.marka = marka;
        this.model = model;
        this.kilometraza = kilometraza;
        this.owner = owner;
        
        
    }
    public double speed()
    {
        return this.maxSpeed;
    }
    public String toString ()
    {
          return godina_proizvodnje+","+zapremina_motora+","+boja+","+marka+","+model+","+kilometraza+","+owner;
    }

}

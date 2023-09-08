package assigment5;
public class Wine extends Product
{
   public String vol;
   public final double ALCOHOL_TAX = 1.1;
   
    public Wine(String productName, int barcode, double price, String vol) 
    {
        super(productName, barcode, price);
        this.vol = vol;
    }
    @Override
    public double newPrice() 
    {
        return super.newPrice() * ALCOHOL_TAX; 
    }       
    @Override
    public String toString() 
    {
        return super.toString()+ " , Vol :" + vol ;
    }           
}

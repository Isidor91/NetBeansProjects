package assigment5;
public class Chocolate extends Product
{
    public String weight;
    
    public Chocolate(String productName, int barcode, double price, String weight) 
    {
        super(productName, barcode, price);
        this.weight = weight;
    }
   
    @Override
    public String toString()
    {
        return super.toString()+  " , Weight : " + weight ;
    }
        
   
}

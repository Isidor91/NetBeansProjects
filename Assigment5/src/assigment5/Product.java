package assigment5;
public abstract class Product 
{
    public String productName;
    public int barcode;
    public double price;
    
    public final double PRODUCT_TAX = 1.2;
    
    public Product(String productName, int barcode, double price) 
    {
        this.productName = productName;
        this.barcode = barcode;
        this.price = price;
    }
    public double newPrice()
    {
        return this.price*PRODUCT_TAX;
    }
    @Override
    public String toString() 
    {
        return  " Product Name : " + productName + " , Bar-code : " + barcode + " , Price : " + this.newPrice() + " $ tax/incl.";
    }
    

   
    
    
}

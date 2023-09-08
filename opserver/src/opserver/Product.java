package opserver;
import java.sql.SQLException;
import java.util.ArrayList;
public abstract class Product 
{
    protected int price;
    protected Subject s;
    
    public Product(int price, Subject s) 
    {
        this.price = price;
        this.s = s;
        s.addProduct(this);
    }
    public abstract void updatePrice();
    @Override
    public String toString() 
    {
        return "Product " + "price= " + price;
    }
    
   
    
    
}
